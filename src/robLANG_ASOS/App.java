package robLANG_ASOS;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import robLANG_ASOS.adaptations.modules.HalfSpeedModule;
import robLANG_ASOS.adaptations.modules.QuarterSpeedModule;
import robLANG_ASOS.adaptations.modules.ThreeQuarterSpeedModule;
import robLANG_ASOS.impl.ConstructWithContextImpl;
import robLANG_ASOS.interpreter.SelfAdaptiveRobLANG_ASOS;

public class App {

	private static String resultPath;
	private static SelfAdaptiveRobLANG_ASOS lang;
	private static Robot theRobot;

	public static void main(String[] args) {

		resultPath = "";
		String filePath = args[0];

		boolean isBench = args[0].startsWith("-");
		char typeBench = args[0].charAt(1);
		
		if (isBench) {
			resultPath = args[1];
			filePath = args[2];
		}

		Injector injector = new RobLANGStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		RobLANG_ASOSPackage.eINSTANCE.eClass();

		URI uri = URI.createFileURI(filePath);
		Resource resource = resourceSet.getResource(uri, true);

		// SelfAdaptiveRobLANG_ASOS.initContext(new StandaloneContext());
		lang = new SelfAdaptiveRobLANG_ASOS();
		lang.registerModule(new QuarterSpeedModule());
		lang.registerModule(new HalfSpeedModule());
		lang.registerModule(new ThreeQuarterSpeedModule());

		theRobot = (Robot) resource.getContents().get(0);
		
		if (typeBench == 'e') {
			((StandaloneContext) ConstructWithContextImpl.ctx).invertTO();
		} else if (typeBench == 's') {
			((StandaloneContext) ConstructWithContextImpl.ctx).switches = true;
		} 
		
		if (isBench) {
			benchmark();
		} else {
			run();
		}
	}

	public static Object benchmark() {
		long start = System.currentTimeMillis();
		Object out = theRobot.accept(lang.getVisitor(), lang.getAdaptationContext());
		long end = System.currentTimeMillis();
		
		long duration = end - start;
		String resultFilname = resultPath.substring(resultPath.lastIndexOf("/")+1);
		String filenamesplit = resultFilname.substring(0,resultFilname.lastIndexOf("."));
		String[] benchInfo = filenamesplit.split("_");
		
		try {
			File resultFile = new File(resultPath);
			resultFile.createNewFile();
			FileWriter fw = new FileWriter(resultFile, true);
		    BufferedWriter bw = new BufferedWriter(fw);
		    bw.write(benchInfo[1]+","+benchInfo[0]+","+benchInfo[2]+","+duration);
		    bw.newLine();
		    bw.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		return out;
	}

	public static Object run() {
		Object out = theRobot.accept(lang.getVisitor(), lang.getAdaptationContext());
		return out;
	}
}
