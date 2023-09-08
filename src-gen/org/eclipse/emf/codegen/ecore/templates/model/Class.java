package org.eclipse.emf.codegen.ecore.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil;

public class Class
{
  protected static String nl;
  public static synchronized Class create(String lineSeparator)
  {
    nl = lineSeparator;
    Class result = new Class();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";";
  protected final String TEXT_3 = NL + "package ";
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL + "import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;" + NL + "import ";
  protected final String TEXT_6 = ".interfaces.";
  protected final String TEXT_7 = "Interface;";
  protected final String TEXT_8 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * A representation of the model object '<em><b>";
  protected final String TEXT_9 = "</b></em>'." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_10 = NL + " *" + NL + " * <!-- begin-model-doc -->" + NL + " * ";
  protected final String TEXT_11 = NL + " * <!-- end-model-doc -->";
  protected final String TEXT_12 = NL + " *";
  protected final String TEXT_13 = NL + " * <p>" + NL + " * The following features are supported:" + NL + " * </p>" + NL + " * <ul>";
  protected final String TEXT_14 = NL + " *   <li>{@link ";
  protected final String TEXT_15 = "#";
  protected final String TEXT_16 = " <em>";
  protected final String TEXT_17 = "</em>}</li>";
  protected final String TEXT_18 = NL + " * </ul>";
  protected final String TEXT_19 = NL + " * @see ";
  protected final String TEXT_20 = "#get";
  protected final String TEXT_21 = "()";
  protected final String TEXT_22 = NL + " * @model ";
  protected final String TEXT_23 = NL + " *        ";
  protected final String TEXT_24 = NL + " * @model";
  protected final String TEXT_25 = NL + " * @extends ";
  protected final String TEXT_26 = NL + " * ";
  protected final String TEXT_27 = NL + " * @generated" + NL + " */";
  protected final String TEXT_28 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model object '<em><b>";
  protected final String TEXT_29 = NL + " * <p>" + NL + " * The following features are implemented:" + NL + " * </p>" + NL + " * <ul>";
  protected final String TEXT_30 = NL + "@Deprecated";
  protected final String TEXT_31 = NL + "@SuppressWarnings(\"deprecation\")";
  protected final String TEXT_32 = NL + "public";
  protected final String TEXT_33 = " abstract";
  protected final String TEXT_34 = " class ";
  protected final String TEXT_35 = NL + "public interface ";
  protected final String TEXT_36 = ", AdaptableNode<";
  protected final String TEXT_37 = "Interface>";
  protected final String TEXT_38 = NL + "{";
  protected final String TEXT_39 = NL + "\t@Override" + NL + "\tdefault public ";
  protected final String TEXT_40 = "Interface defaultInterface() {" + NL + "\t\treturn new ";
  protected final String TEXT_41 = "Interface();" + NL + "\t}";
  protected final String TEXT_42 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_43 = " copyright = ";
  protected final String TEXT_44 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_45 = " mofDriverNumber = \"";
  protected final String TEXT_46 = "\";";
  protected final String TEXT_47 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final long serialVersionUID = 1L;" + NL;
  protected final String TEXT_48 = NL + "\t/**" + NL + "\t * An array of objects representing the values of non-primitive features." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_49 = NL + "\t@";
  protected final String TEXT_50 = NL + "\tprotected Object[] ";
  protected final String TEXT_51 = ";" + NL;
  protected final String TEXT_52 = NL + "\t/**" + NL + "\t * A bit field representing the indices of non-primitive feature values." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_53 = NL + "\tprotected int ";
  protected final String TEXT_54 = NL + "\t/**" + NL + "\t * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_55 = " = 0;" + NL;
  protected final String TEXT_56 = NL + "\t/**" + NL + "\t * The empty value for the '{@link #";
  protected final String TEXT_57 = "() <em>";
  protected final String TEXT_58 = "</em>}' array accessor." + NL + "\t * This is specialized for the more specific element type known in this context." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_59 = NL + "\t * ";
  protected final String TEXT_60 = NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_61 = NL + "\t@Deprecated";
  protected final String TEXT_62 = NL + "\t@SuppressWarnings(\"rawtypes\")";
  protected final String TEXT_63 = NL + "\tprotected static final ";
  protected final String TEXT_64 = "[] ";
  protected final String TEXT_65 = "_EEMPTY_ARRAY = new ";
  protected final String TEXT_66 = " [0]";
  protected final String TEXT_67 = NL + "\t/**" + NL + "\t * The cached setting delegate for the '{@link #";
  protected final String TEXT_68 = "</em>}' ";
  protected final String TEXT_69 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_70 = NL + "\tprotected ";
  protected final String TEXT_71 = ".Internal.SettingDelegate ";
  protected final String TEXT_72 = "__ESETTING_DELEGATE = ((";
  protected final String TEXT_73 = ".Internal)";
  protected final String TEXT_74 = ").getSettingDelegate();" + NL;
  protected final String TEXT_75 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_76 = " ";
  protected final String TEXT_77 = "</em>}' array accessor." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_78 = NL + "\t/**" + NL + "\t * The default value of the '{@link #";
  protected final String TEXT_79 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_80 = "; // TODO The default value literal \"";
  protected final String TEXT_81 = "\" is not valid.";
  protected final String TEXT_82 = " = ";
  protected final String TEXT_83 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_84 = NL + "\t/**" + NL + "\t * The offset of the flags representing the value of the '{@link #";
  protected final String TEXT_85 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_86 = NL + "\tprotected static final int ";
  protected final String TEXT_87 = "_EFLAG_OFFSET = ";
  protected final String TEXT_88 = ";" + NL + "" + NL + "\t/**" + NL + "\t * The flags representing the default value of the '{@link #";
  protected final String TEXT_89 = "_EFLAG_DEFAULT = ";
  protected final String TEXT_90 = ".ordinal()";
  protected final String TEXT_91 = ".VALUES.indexOf(";
  protected final String TEXT_92 = ")";
  protected final String TEXT_93 = " << ";
  protected final String TEXT_94 = "_EFLAG_OFFSET;" + NL + "" + NL + "\t/**" + NL + "\t * The array of enumeration values for '{@link ";
  protected final String TEXT_95 = "}'" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_96 = NL + "\tprivate static final ";
  protected final String TEXT_97 = "_EFLAG_VALUES = ";
  protected final String TEXT_98 = ".values()";
  protected final String TEXT_99 = "(";
  protected final String TEXT_100 = "[])";
  protected final String TEXT_101 = ".VALUES.toArray(new ";
  protected final String TEXT_102 = "[";
  protected final String TEXT_103 = ".VALUES.size()])";
  protected final String TEXT_104 = NL + "\t/**" + NL + "\t * The flag";
  protected final String TEXT_105 = " representing the value of the '{@link #";
  protected final String TEXT_106 = "_EFLAG = ";
  protected final String TEXT_107 = "_EFLAG_OFFSET";
  protected final String TEXT_108 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_109 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_110 = "_ESETFLAG = 1 << ";
  protected final String TEXT_111 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_112 = NL + "\tprotected boolean ";
  protected final String TEXT_113 = "ESet;" + NL;
  protected final String TEXT_114 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_115 = ".getFeatureID(";
  protected final String TEXT_116 = ") - ";
  protected final String TEXT_117 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_118 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_119 = NL + "\tprivate static final int ";
  protected final String TEXT_120 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int EOPERATION_OFFSET_CORRECTION = ";
  protected final String TEXT_121 = ".getOperationID(";
  protected final String TEXT_122 = "public";
  protected final String TEXT_123 = "protected";
  protected final String TEXT_124 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_125 = NL + "\t\t";
  protected final String TEXT_126 = " |= ";
  protected final String TEXT_127 = "_EFLAG";
  protected final String TEXT_128 = "_DEFAULT";
  protected final String TEXT_129 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_130 = NL + "\t@Override";
  protected final String TEXT_131 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_132 = ";" + NL + "\t}" + NL;
  protected final String TEXT_133 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected static final int ESTATIC_FEATURE_COUNT = ";
  protected final String TEXT_134 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_135 = NL + "\tprotected int eStaticFeatureCount()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_136 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * This is specialized for the more specific element type known in this context." + NL + "\t * @see #";
  protected final String TEXT_137 = NL + "\tpublic ";
  protected final String TEXT_138 = "()" + NL + "\t{";
  protected final String TEXT_139 = " list = (";
  protected final String TEXT_140 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_141 = "_EEMPTY_ARRAY;";
  protected final String TEXT_142 = NL + "\t\tif (";
  protected final String TEXT_143 = " == null || ";
  protected final String TEXT_144 = ".isEmpty()) return ";
  protected final String TEXT_145 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_146 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_147 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_148 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * This is specialized for the more specific element type known in this context.";
  protected final String TEXT_149 = "_";
  protected final String TEXT_150 = " = (";
  protected final String TEXT_151 = ")eVirtualGet(";
  protected final String TEXT_152 = ");";
  protected final String TEXT_153 = " == null)" + NL + "\t\t{";
  protected final String TEXT_154 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_155 = ", ";
  protected final String TEXT_156 = " = new ";
  protected final String TEXT_157 = NL + "\t\t\t";
  protected final String TEXT_158 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_159 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * This is specialized for the more specific type known in this context.";
  protected final String TEXT_160 = " basicSet";
  protected final String TEXT_161 = " new";
  protected final String TEXT_162 = " msgs)" + NL + "\t{" + NL + "\t\treturn super.basicSet";
  protected final String TEXT_163 = "(new";
  protected final String TEXT_164 = ", msgs);" + NL + "\t}" + NL;
  protected final String TEXT_165 = NL + "\tpublic void set";
  protected final String TEXT_166 = ")" + NL + "\t{" + NL + "\t\tsuper.set";
  protected final String TEXT_167 = ");" + NL + "\t}" + NL;
  protected final String TEXT_168 = NL + "\t";
  protected final String TEXT_169 = "();" + NL;
  protected final String TEXT_170 = " get";
  protected final String TEXT_171 = "(int index);" + NL;
  protected final String TEXT_172 = "(int index)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_173 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_174 = NL + "\tint get";
  protected final String TEXT_175 = "Length();" + NL;
  protected final String TEXT_176 = NL + "\tpublic int get";
  protected final String TEXT_177 = "Length()" + NL + "\t{";
  protected final String TEXT_178 = NL + "\t\treturn ";
  protected final String TEXT_179 = "().size();";
  protected final String TEXT_180 = " == null ? 0 : ";
  protected final String TEXT_181 = ".size();";
  protected final String TEXT_182 = NL + "\t}" + NL;
  protected final String TEXT_183 = NL + "\tvoid set";
  protected final String TEXT_184 = "[] new";
  protected final String TEXT_185 = ");" + NL;
  protected final String TEXT_186 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_187 = "()).setData(new";
  protected final String TEXT_188 = ".length, new";
  protected final String TEXT_189 = "(int index, ";
  protected final String TEXT_190 = " element);" + NL;
  protected final String TEXT_191 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_192 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_193 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_194 = "</b></em>' ";
  protected final String TEXT_195 = ".";
  protected final String TEXT_196 = NL + "\t * The key is of type ";
  protected final String TEXT_197 = "list of {@link ";
  protected final String TEXT_198 = "}";
  protected final String TEXT_199 = "{@link ";
  protected final String TEXT_200 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_201 = ",";
  protected final String TEXT_202 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_203 = NL + "\t * The default value is <code>";
  protected final String TEXT_204 = "</code>.";
  protected final String TEXT_205 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_206 = "}.";
  protected final String TEXT_207 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_208 = "</em>}'.";
  protected final String TEXT_209 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_210 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_211 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_212 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_213 = "</em>' ";
  protected final String TEXT_214 = NL + "\t * @see ";
  protected final String TEXT_215 = NL + "\t * @see #isSet";
  protected final String TEXT_216 = NL + "\t * @see #unset";
  protected final String TEXT_217 = NL + "\t * @see #set";
  protected final String TEXT_218 = NL + "\t * @model ";
  protected final String TEXT_219 = NL + "\t *        ";
  protected final String TEXT_220 = NL + "\t * @model";
  protected final String TEXT_221 = ")eDynamicGet(";
  protected final String TEXT_222 = " - ESTATIC_FEATURE_COUNT";
  protected final String TEXT_223 = ", true, ";
  protected final String TEXT_224 = ").";
  protected final String TEXT_225 = ")eGet(";
  protected final String TEXT_226 = ", true)";
  protected final String TEXT_227 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false)";
  protected final String TEXT_228 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_229 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_230 = "eContainer";
  protected final String TEXT_231 = "eInternalContainer";
  protected final String TEXT_232 = "();";
  protected final String TEXT_233 = " != null && ";
  protected final String TEXT_234 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_235 = " old";
  protected final String TEXT_236 = ";" + NL + "\t\t\t";
  protected final String TEXT_237 = "eResolveProxy(old";
  protected final String TEXT_238 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_239 = " != old";
  protected final String TEXT_240 = ")" + NL + "\t\t\t{";
  protected final String TEXT_241 = NL + "\t\t\t\t";
  protected final String TEXT_242 = " msgs = old";
  protected final String TEXT_243 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_244 = ", null, null);";
  protected final String TEXT_245 = " msgs =  old";
  protected final String TEXT_246 = ".eInverseRemove(this, ";
  protected final String TEXT_247 = ".class, null);";
  protected final String TEXT_248 = NL + "\t\t\t\tif (new";
  protected final String TEXT_249 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_250 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_251 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_252 = ", null, msgs);";
  protected final String TEXT_253 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_254 = ".eInverseAdd(this, ";
  protected final String TEXT_255 = ".class, msgs);";
  protected final String TEXT_256 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_257 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_258 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_259 = "(this, ";
  protected final String TEXT_260 = ".RESOLVE, ";
  protected final String TEXT_261 = ", old";
  protected final String TEXT_262 = "));";
  protected final String TEXT_263 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_264 = NL + "\t\treturn (";
  protected final String TEXT_265 = " & ";
  protected final String TEXT_266 = "_EFLAG) != 0;";
  protected final String TEXT_267 = "_EFLAG_VALUES[(";
  protected final String TEXT_268 = "_EFLAG) >>> ";
  protected final String TEXT_269 = "_EFLAG_OFFSET];";
  protected final String TEXT_270 = " = basicGet";
  protected final String TEXT_271 = "();" + NL + "\t\treturn ";
  protected final String TEXT_272 = ".eIsProxy() ? ";
  protected final String TEXT_273 = "eResolveProxy(";
  protected final String TEXT_274 = ") : ";
  protected final String TEXT_275 = NL + "\t\treturn new ";
  protected final String TEXT_276 = "((";
  protected final String TEXT_277 = ".Internal)((";
  protected final String TEXT_278 = ".Internal.Wrapper)get";
  protected final String TEXT_279 = "()).featureMap().";
  protected final String TEXT_280 = "list(";
  protected final String TEXT_281 = ")get";
  protected final String TEXT_282 = "().";
  protected final String TEXT_283 = NL + "\t\treturn ((";
  protected final String TEXT_284 = "()).featureMap().list(";
  protected final String TEXT_285 = NL + "\t\treturn get";
  protected final String TEXT_286 = "().list(";
  protected final String TEXT_287 = "()).featureMap().get(";
  protected final String TEXT_288 = "get";
  protected final String TEXT_289 = "().get(";
  protected final String TEXT_290 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_291 = "' ";
  protected final String TEXT_292 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT";
  protected final String TEXT_293 = NL + "\t\t// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting" + NL + "\t\t// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.";
  protected final String TEXT_294 = "EcoreEMap";
  protected final String TEXT_295 = "BasicFeatureMap";
  protected final String TEXT_296 = "EcoreEList";
  protected final String TEXT_297 = " should be used.";
  protected final String TEXT_298 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_299 = " basicGet";
  protected final String TEXT_300 = ", false, ";
  protected final String TEXT_301 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false)";
  protected final String TEXT_302 = ")eInternalContainer();";
  protected final String TEXT_303 = ")((";
  protected final String TEXT_304 = ", false);";
  protected final String TEXT_305 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_306 = " msgs)" + NL + "\t{";
  protected final String TEXT_307 = NL + "\t\tmsgs = eBasicSetContainer(";
  protected final String TEXT_308 = ", msgs);";
  protected final String TEXT_309 = NL + "\t\treturn msgs;";
  protected final String TEXT_310 = NL + "\t\tmsgs = eDynamicInverseAdd(";
  protected final String TEXT_311 = NL + "\t\tObject old";
  protected final String TEXT_312 = " = eVirtualSet(";
  protected final String TEXT_313 = ", new";
  protected final String TEXT_314 = ";" + NL + "\t\t";
  protected final String TEXT_315 = " = new";
  protected final String TEXT_316 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_317 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_318 = NL + "\t\tboolean old";
  protected final String TEXT_319 = "ESet = (";
  protected final String TEXT_320 = "_ESETFLAG) != 0;";
  protected final String TEXT_321 = "_ESETFLAG;";
  protected final String TEXT_322 = "ESet = ";
  protected final String TEXT_323 = "ESet;";
  protected final String TEXT_324 = "ESet = true;";
  protected final String TEXT_325 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_326 = " notification = new ";
  protected final String TEXT_327 = ".SET, ";
  protected final String TEXT_328 = "isSetChange ? null : old";
  protected final String TEXT_329 = "old";
  protected final String TEXT_330 = "isSetChange";
  protected final String TEXT_331 = "!old";
  protected final String TEXT_332 = "ESet";
  protected final String TEXT_333 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_334 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_335 = "()).featureMap()).basicAdd(";
  protected final String TEXT_336 = ".Internal)get";
  protected final String TEXT_337 = "()).basicAdd(";
  protected final String TEXT_338 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_339 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_340 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_341 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param ";
  protected final String TEXT_342 = "new";
  protected final String TEXT_343 = "value";
  protected final String TEXT_344 = " the new value of the '<em>";
  protected final String TEXT_345 = NL + "\t * @see #";
  protected final String TEXT_346 = " value);" + NL;
  protected final String TEXT_347 = ")" + NL + "\t{";
  protected final String TEXT_348 = NL + "\t\teDynamicSet(";
  protected final String TEXT_349 = "new ";
  protected final String TEXT_350 = NL + "\t\teSet(";
  protected final String TEXT_351 = "__ESETTING_DELEGATE.dynamicSet(this, null, 0, ";
  protected final String TEXT_352 = NL + "\t\tif (new";
  protected final String TEXT_353 = " != eInternalContainer() || (eContainerFeatureID() != ";
  protected final String TEXT_354 = " && new";
  protected final String TEXT_355 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_356 = ".isAncestor(this, ";
  protected final String TEXT_357 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_358 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_359 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_360 = " != null)" + NL + "\t\t\t\tmsgs = ";
  protected final String TEXT_361 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_362 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_363 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_364 = " != ";
  protected final String TEXT_365 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_366 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_367 = " != null)";
  protected final String TEXT_368 = NL + "\t\t\t\tmsgs = ";
  protected final String TEXT_369 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_370 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_371 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_372 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_373 = NL + "\t\t\tboolean old";
  protected final String TEXT_374 = "ESet = eVirtualIsSet(";
  protected final String TEXT_375 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_376 = ", !old";
  protected final String TEXT_377 = "ESet));";
  protected final String TEXT_378 = NL + "\t\t}";
  protected final String TEXT_379 = ") ";
  protected final String TEXT_380 = "_EFLAG; else ";
  protected final String TEXT_381 = " &= ~";
  protected final String TEXT_382 = "_EFLAG;";
  protected final String TEXT_383 = " == null) new";
  protected final String TEXT_384 = "_EDEFAULT;" + NL + "\t\t";
  protected final String TEXT_385 = " & ~";
  protected final String TEXT_386 = "_EFLAG | ";
  protected final String TEXT_387 = ".VALUES.indexOf(new";
  protected final String TEXT_388 = "_EFLAG_OFFSET;";
  protected final String TEXT_389 = " == null ? ";
  protected final String TEXT_390 = " : new";
  protected final String TEXT_391 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_392 = "isSetChange ? ";
  protected final String TEXT_393 = " : old";
  protected final String TEXT_394 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_395 = NL + "\t\t((";
  protected final String TEXT_396 = "()).featureMap()).set(";
  protected final String TEXT_397 = "()).set(";
  protected final String TEXT_398 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_399 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_400 = " basicUnset";
  protected final String TEXT_401 = NL + "\t\treturn eDynamicInverseRemove(";
  protected final String TEXT_402 = "basicGet";
  protected final String TEXT_403 = "(), ";
  protected final String TEXT_404 = "Object old";
  protected final String TEXT_405 = "eVirtualUnset(";
  protected final String TEXT_406 = " = null;";
  protected final String TEXT_407 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_408 = "ESet = false;";
  protected final String TEXT_409 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_410 = ".UNSET, ";
  protected final String TEXT_411 = "isSetChange ? old";
  protected final String TEXT_412 = " : null";
  protected final String TEXT_413 = ", null, ";
  protected final String TEXT_414 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_415 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_416 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_417 = NL + "\tvoid unset";
  protected final String TEXT_418 = NL + "\tpublic void unset";
  protected final String TEXT_419 = NL + "\t\teDynamicUnset(";
  protected final String TEXT_420 = NL + "\t\teUnset(";
  protected final String TEXT_421 = "__ESETTING_DELEGATE.dynamicUnset(this, null, 0);";
  protected final String TEXT_422 = " != null) ((";
  protected final String TEXT_423 = ".Unsettable";
  protected final String TEXT_424 = ").unset();";
  protected final String TEXT_425 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_426 = " msgs = null;";
  protected final String TEXT_427 = NL + "\t\t\tmsgs = ";
  protected final String TEXT_428 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_429 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_430 = ", null, null, old";
  protected final String TEXT_431 = " = eVirtualUnset(";
  protected final String TEXT_432 = "_EFLAG_DEFAULT;";
  protected final String TEXT_433 = " : ";
  protected final String TEXT_434 = "()).featureMap()).clear(";
  protected final String TEXT_435 = "()).clear(";
  protected final String TEXT_436 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_437 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_438 = " is set.";
  protected final String TEXT_439 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_440 = NL + "\tboolean isSet";
  protected final String TEXT_441 = NL + "\tpublic boolean isSet";
  protected final String TEXT_442 = NL + "\t\treturn eDynamicIsSet(";
  protected final String TEXT_443 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_444 = "__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);";
  protected final String TEXT_445 = " != null && ((";
  protected final String TEXT_446 = ").isSet();";
  protected final String TEXT_447 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_448 = NL + "\t\treturn !((";
  protected final String TEXT_449 = "()).featureMap()).isEmpty(";
  protected final String TEXT_450 = "()).isEmpty(";
  protected final String TEXT_451 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_452 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_453 = NL + "\t/**" + NL + "\t * The cached validation expression for the '{@link #";
  protected final String TEXT_454 = ") <em>";
  protected final String TEXT_455 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_456 = "__EEXPRESSION = \"";
  protected final String TEXT_457 = NL + "\t/**" + NL + "\t * The cached invocation delegate for the '{@link #";
  protected final String TEXT_458 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_459 = ".Internal.InvocationDelegate ";
  protected final String TEXT_460 = "__EINVOCATION_DELEGATE = ((";
  protected final String TEXT_461 = ").getInvocationDelegate();" + NL;
  protected final String TEXT_462 = NL + "\t/**";
  protected final String TEXT_463 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_464 = NL + "\t * @param ";
  protected final String TEXT_465 = NL + "\t *   ";
  protected final String TEXT_466 = NL + "\t{";
  protected final String TEXT_467 = NL + "\t\treturn" + NL + "\t\t\t";
  protected final String TEXT_468 = ".validate" + NL + "\t\t\t\t(";
  protected final String TEXT_469 = "," + NL + "\t\t\t\t this," + NL + "\t\t\t\t ";
  protected final String TEXT_470 = "," + NL + "\t\t\t\t ";
  protected final String TEXT_471 = "," + NL + "\t\t\t\t \"";
  protected final String TEXT_472 = "\",";
  protected final String TEXT_473 = NL + "\t\t\t\t ";
  protected final String TEXT_474 = "__EEXPRESSION," + NL + "\t\t\t\t ";
  protected final String TEXT_475 = ".ERROR," + NL + "\t\t\t\t ";
  protected final String TEXT_476 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t ";
  protected final String TEXT_477 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_478 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_479 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_480 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_481 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_482 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_483 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_484 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_485 = "\", ";
  protected final String TEXT_486 = ".getObjectLabel(this, ";
  protected final String TEXT_487 = ") }),";
  protected final String TEXT_488 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_489 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_490 = "__EINVOCATION_DELEGATE.dynamicInvoke(this, ";
  protected final String TEXT_491 = ".UnmodifiableEList<Object>(";
  protected final String TEXT_492 = "null";
  protected final String TEXT_493 = NL + "\t\t\treturn ";
  protected final String TEXT_494 = NL + "\t\t}" + NL + "\t\tcatch (";
  protected final String TEXT_495 = " ite)" + NL + "\t\t{" + NL + "\t\t\tthrow new ";
  protected final String TEXT_496 = "(ite);" + NL + "\t\t}";
  protected final String TEXT_497 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_498 = " eInverseAdd(";
  protected final String TEXT_499 = " otherEnd, int featureID, ";
  protected final String TEXT_500 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_501 = ")" + NL + "\t\t{";
  protected final String TEXT_502 = NL + "\t\t\tcase ";
  protected final String TEXT_503 = ":";
  protected final String TEXT_504 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_505 = ".InternalMapView";
  protected final String TEXT_506 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_507 = NL + "\t\t\t\treturn (";
  protected final String TEXT_508 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_509 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_510 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_511 = ")otherEnd, msgs);";
  protected final String TEXT_512 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_513 = NL + "\t\t\t\tif (";
  protected final String TEXT_514 = NL + "\t\t\t\t\tmsgs = ";
  protected final String TEXT_515 = NL + "\t\t\tdefault:";
  protected final String TEXT_516 = "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_517 = "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_518 = " eInverseRemove(";
  protected final String TEXT_519 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_520 = ".Internal.Wrapper)";
  protected final String TEXT_521 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_522 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_523 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_524 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_525 = "(msgs);";
  protected final String TEXT_526 = "(null, msgs);";
  protected final String TEXT_527 = "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_528 = "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_529 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_530 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID()";
  protected final String TEXT_531 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_532 = "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_533 = "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_534 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_535 = NL + "\t\t\t\treturn ";
  protected final String TEXT_536 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_537 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_538 = "());";
  protected final String TEXT_539 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_540 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_541 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_542 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_543 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_544 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_545 = "().map();";
  protected final String TEXT_546 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_547 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_548 = "()).getWrapper();";
  protected final String TEXT_549 = "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_550 = "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_551 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_552 = NL + "\t\t\t\t((";
  protected final String TEXT_553 = "()).featureMap()).set(newValue);";
  protected final String TEXT_554 = "()).set(newValue);";
  protected final String TEXT_555 = ".Setting)((";
  protected final String TEXT_556 = "()).eMap()).set(newValue);";
  protected final String TEXT_557 = ".Setting)";
  protected final String TEXT_558 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_559 = "().addAll((";
  protected final String TEXT_560 = "<? extends ";
  protected final String TEXT_561 = ">";
  protected final String TEXT_562 = ")newValue);";
  protected final String TEXT_563 = NL + "\t\t\t\tset";
  protected final String TEXT_564 = "(((";
  protected final String TEXT_565 = ")newValue).";
  protected final String TEXT_566 = "newValue);";
  protected final String TEXT_567 = NL + "\t\t\t\treturn;";
  protected final String TEXT_568 = "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_569 = "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_570 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_571 = "()).featureMap().clear();";
  protected final String TEXT_572 = "().clear();";
  protected final String TEXT_573 = NL + "\t\t\t\tunset";
  protected final String TEXT_574 = ")null);";
  protected final String TEXT_575 = "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_576 = "\t\teDynamicUnset(featureID);";
  protected final String TEXT_577 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_578 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_579 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_580 = "()).featureMap().isEmpty();";
  protected final String TEXT_581 = " != null && !";
  protected final String TEXT_582 = ".featureMap().isEmpty();";
  protected final String TEXT_583 = ".isEmpty();";
  protected final String TEXT_584 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_585 = NL + "\t\t\t\treturn !";
  protected final String TEXT_586 = "().isEmpty();";
  protected final String TEXT_587 = " != null;";
  protected final String TEXT_588 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_589 = ") != null;";
  protected final String TEXT_590 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_591 = "() != null;";
  protected final String TEXT_592 = "_EFLAG) != 0) != ";
  protected final String TEXT_593 = "_EFLAG) != ";
  protected final String TEXT_594 = ") != ";
  protected final String TEXT_595 = "() != ";
  protected final String TEXT_596 = " != null : !";
  protected final String TEXT_597 = ".equals(";
  protected final String TEXT_598 = "() != null : !";
  protected final String TEXT_599 = "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_600 = "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_601 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_602 = " baseClass)" + NL + "\t{";
  protected final String TEXT_603 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_604 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID";
  protected final String TEXT_605 = NL + "\t\t\t\tcase ";
  protected final String TEXT_606 = ": return ";
  protected final String TEXT_607 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_608 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}";
  protected final String TEXT_609 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_610 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_611 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_612 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID";
  protected final String TEXT_613 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_614 = NL + "\tpublic int eDerivedOperationID(int baseOperationID, Class";
  protected final String TEXT_615 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID)" + NL + "\t\t\t{";
  protected final String TEXT_616 = NL + "\t\t\t\tdefault: return super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_617 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID";
  protected final String TEXT_618 = NL + "\t\treturn super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_619 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_620 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_621 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_622 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_623 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_624 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_625 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_626 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_627 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_628 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_629 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_630 = NL + "\t@SuppressWarnings(";
  protected final String TEXT_631 = "\"unchecked\"";
  protected final String TEXT_632 = "{\"rawtypes\", \"unchecked\" }";
  protected final String TEXT_633 = NL + "\tpublic Object eInvoke(int operationID, ";
  protected final String TEXT_634 = " arguments) throws ";
  protected final String TEXT_635 = NL + "\t{" + NL + "\t\tswitch (operationID";
  protected final String TEXT_636 = NL + "\t\t\t\ttry" + NL + "\t\t\t\t{";
  protected final String TEXT_637 = "arguments.get(";
  protected final String TEXT_638 = ");" + NL + "\t\t\t\t";
  protected final String TEXT_639 = "return null;";
  protected final String TEXT_640 = "return ";
  protected final String TEXT_641 = NL + "\t\t\t\t}" + NL + "\t\t\t\tcatch (";
  protected final String TEXT_642 = " throwable)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tthrow new ";
  protected final String TEXT_643 = "(throwable);" + NL + "\t\t\t\t}";
  protected final String TEXT_644 = "\t\treturn super.eInvoke(operationID, arguments);";
  protected final String TEXT_645 = "\t\treturn eDynamicInvoke(operationID, arguments);";
  protected final String TEXT_646 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\t";
  protected final String TEXT_647 = " result = new ";
  protected final String TEXT_648 = "(super.toString());";
  protected final String TEXT_649 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_650 = ": \");";
  protected final String TEXT_651 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_652 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_653 = ")) result.append(eVirtualGet(";
  protected final String TEXT_654 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_655 = "_ESETFLAG) != 0";
  protected final String TEXT_656 = ") result.append((";
  protected final String TEXT_657 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_658 = ") result.append(";
  protected final String TEXT_659 = "_EFLAG_OFFSET]); else result.append(\"<unset>\");";
  protected final String TEXT_660 = "); else result.append(\"<unset>\");";
  protected final String TEXT_661 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_662 = NL + "\t\tresult.append((";
  protected final String TEXT_663 = "_EFLAG) != 0);";
  protected final String TEXT_664 = NL + "\t\tresult.append(";
  protected final String TEXT_665 = "_EFLAG_OFFSET]);";
  protected final String TEXT_666 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_667 = NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_668 = NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_669 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_670 = NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_671 = " getKey()" + NL + "\t{";
  protected final String TEXT_672 = "(getTypedKey());";
  protected final String TEXT_673 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_674 = NL + "\tpublic void setKey(";
  protected final String TEXT_675 = " key)" + NL + "\t{";
  protected final String TEXT_676 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_677 = "key);";
  protected final String TEXT_678 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_679 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_680 = ")key).";
  protected final String TEXT_681 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_682 = ")key);";
  protected final String TEXT_683 = " getValue()" + NL + "\t{";
  protected final String TEXT_684 = "(getTypedValue());";
  protected final String TEXT_685 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_686 = " setValue(";
  protected final String TEXT_687 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_688 = " oldValue = getValue();";
  protected final String TEXT_689 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_690 = "value);";
  protected final String TEXT_691 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_692 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_693 = ")value).";
  protected final String TEXT_694 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_695 = ")value);";
  protected final String TEXT_696 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_697 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_698 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_699 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_700 = NL + "} //";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * Copyright (c) 2002-2019 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Alexander Fedorov <alexander.fedorov@arsysop.ru> - Bug 546714
 */

    final GenClass genClass = (GenClass)((Object[])argument)[0]; final GenPackage genPackage = genClass.getGenPackage(); final GenModel genModel=genPackage.getGenModel();
    final boolean isJDK50 = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50;
    final boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); final boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]); final boolean useInterfaceOverrideAnnotation = genModel.useInterfaceOverrideAnnotation() && !(isInterface && isImplementation);
    final boolean isNode = isInterface && !genPackage.getInterfacePackageName().contains(".");
    final boolean isGWT = genModel.getRuntimePlatform() == GenRuntimePlatform.GWT;
    final boolean forceDefaultCase = genModel.isSwitchMissingDefaultCase();String indentDefaultCase = forceDefaultCase ? "\t\t" : "";
    final String publicStaticFinalFlag = isImplementation ? "public static final " : "";
    final String singleWildcard = isJDK50 ? "<?>" : "";
    final String negativeOffsetCorrection = genClass.hasOffsetCorrection() ? " - " + genClass.getOffsetCorrectionField(null) : "";
    final String positiveOffsetCorrection = genClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(null) : "";
    final String negativeOperationOffsetCorrection = genClass.hasOffsetCorrection() ? " - EOPERATION_OFFSET_CORRECTION" : "";
    final String positiveOperationOffsetCorrection = genClass.hasOffsetCorrection() ? " + EOPERATION_OFFSET_CORRECTION" : "";
    if (isInterface) {
    stringBuffer.append(TEXT_1);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_2);
    } else {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_2);
    }
    stringBuffer.append(TEXT_4);
    genModel.markImportLocation(stringBuffer, genPackage);
    if (isImplementation) { genClass.addClassPsuedoImports(); }
    stringBuffer.append(TEXT_4);
    if (isNode) {
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_7);
    }
    stringBuffer.append(TEXT_4);
    if (isInterface) {
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_9);
    if (genClass.hasDocumentation()) {
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genClass.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_11);
    }
    stringBuffer.append(TEXT_12);
    if (!genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_13);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genClass.getRawQualifiedInterfaceName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_17);
    }
    }
    stringBuffer.append(TEXT_18);
    }
    stringBuffer.append(TEXT_12);
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_21);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genClass.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_22);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_23);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_24);
    }}
    if (genClass.needsRootExtendsInterfaceExtendsTag()) {
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genModel.getImportedName(genModel.getRootExtendsInterface()));
    }
    if (genClass.hasImplicitAPITags(true)) {
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genClass.getImplicitAPITags(genModel.getIndentation(stringBuffer), true));
    }
    stringBuffer.append(TEXT_27);
    //Class/interface.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_9);
    if (!genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_29);
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) {
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_17);
    }
    stringBuffer.append(TEXT_18);
    }
    stringBuffer.append(TEXT_12);
    if (genClass.hasImplicitAPITags()) {
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genClass.getImplicitAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_27);
    }
    if (isJDK50 && genClass.hasImplicitAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_30);
    }
    if (isImplementation) {
    if (isJDK50 && !genClass.hasAPIDeprecatedTag() && GenModelUtil.hasImplicitAPIDeprecatedTag(genClass.getEGetGenFeatures(), genClass.getEIsSetGenFeatures(), genClass.getESetGenFeatures(), genClass.getEUnsetGenFeatures(), genClass.getEInverseAddGenFeatures(), genClass.getEInverseRemoveGenFeatures(), genClass.getEBasicRemoveFromContainerGenFeatures(), genClass.getToStringGenFeatures())) {
    stringBuffer.append(TEXT_31);
    }
    stringBuffer.append(TEXT_32);
    if (genClass.isAbstract()) {
    stringBuffer.append(TEXT_33);
    }
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getClassExtends());
    stringBuffer.append(genClass.getClassImplements());
    } else {
    stringBuffer.append(TEXT_35);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getInterfaceExtends());
    if (isNode) {
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_37);
    }
    }
    stringBuffer.append(TEXT_38);
    if (isNode) {
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_41);
    }
    stringBuffer.append(TEXT_4);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_42);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_4);
    }
    if (isImplementation && genModel.getDriverNumber() != null) {
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genModel.getDriverNumber());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_4);
    }
    if (isImplementation && genClass.isJavaIOSerializable()) {
    stringBuffer.append(TEXT_47);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_48);
    if (isGWT) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_50);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_51);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) {
    for (String eVirtualIndexBitField : eVirtualIndexBitFields) {
    stringBuffer.append(TEXT_52);
    if (isGWT) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_53);
    stringBuffer.append(eVirtualIndexBitField);
    stringBuffer.append(TEXT_51);
    }
    }
    }
    }
    if (isImplementation && genClass.isModelRoot() && genModel.isBooleanFlagsEnabled() && genModel.getBooleanFlagsReservedBits() == -1) {
    stringBuffer.append(TEXT_54);
    if (isGWT) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genModel.getBooleanFlagsField());
    stringBuffer.append(TEXT_55);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getReifiedGenFeatures()) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String rawListItemType = genFeature.getRawListItemType(genClass); int index = rawListItemType.indexOf('['); String head = rawListItemType; String tail = ""; if (index != -1) { head = rawListItemType.substring(0, index); tail = rawListItemType.substring(index); } 
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_21);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_60);
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    if (genFeature.getQualifiedListItemType(genClass).contains("<") || genFeature.getArrayItemType(genClass).contains("<")) {
    stringBuffer.append(TEXT_62);
    }
    stringBuffer.append(TEXT_63);
    stringBuffer.append(rawListItemType);
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_66);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_51);
    }
    }
    for (GenFeature genFeature : genClass.getDeclaredFieldGenFeatures()) {
    if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_21);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_60);
    if (isGWT) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_74);
    } else if (genFeature.isListType() || genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_21);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_60);
    if (isGWT) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_51);
    }
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String rawListItemType = genFeature.getRawListItemType(genClass); int index = rawListItemType.indexOf('['); String head = rawListItemType; String tail = ""; if (index != -1) { head = rawListItemType.substring(0, index); tail = rawListItemType.substring(index); } 
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_21);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_60);
    if (genFeature.getQualifiedListItemType(genClass).contains("<") || genFeature.getArrayItemType(genClass).contains("<")) {
    stringBuffer.append(TEXT_62);
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_63);
    stringBuffer.append(rawListItemType);
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_66);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_51);
    }
    } else {
    if (genFeature.hasEDefault() && (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable()))) { String staticDefaultValue = genFeature.getStaticDefaultValue();
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_21);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_60);
    if (genModel.useGenerics() && genFeature.isListDataType() && genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_79);
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getEDefault());
    if ("".equals(staticDefaultValue)) {
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getEcoreFeature().getDefaultValueLiteral());
    stringBuffer.append(TEXT_81);
    } else {
    stringBuffer.append(TEXT_82);
    stringBuffer.append(staticDefaultValue);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(genModel.getNonNLS(staticDefaultValue));
    }
    stringBuffer.append(TEXT_4);
    }
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) { int flagIndex = genClass.getFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_83);
    if (isGWT) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_55);
    }
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_85);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_60);
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_87);
    stringBuffer.append(flagIndex % 32);
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_85);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_60);
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_89);
    if (isJDK50) {
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_90);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_91);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_92);
    }
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getTypeGenClassifier().getFormattedName());
    stringBuffer.append(TEXT_95);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_60);
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_97);
    if (isJDK50) {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_98);
    } else {
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_103);
    }
    stringBuffer.append(TEXT_51);
    }
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genClass.getFlagSize(genFeature) > 1 ? "s" : "");
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_21);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_60);
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genClass.getFlagMask(genFeature));
    stringBuffer.append(TEXT_93);
    if (genFeature.isEnumType()) {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_107);
    } else {
    stringBuffer.append(flagIndex % 32);
    }
    stringBuffer.append(TEXT_51);
    } else {
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_21);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_60);
    if (isGWT) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getSafeName());
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_51);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) { int flagIndex = genClass.getESetFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_83);
    if (isGWT) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_109);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_60);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(flagIndex % 32 );
    stringBuffer.append(TEXT_51);
    } else {
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_109);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_60);
    if (isGWT) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_113);
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    }
    if (isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genClass.getOffsetCorrectionField(null));
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genClass.getImplementedGenFeatures().get(0).getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genClass.getQualifiedFeatureID(genClass.getImplementedGenFeatures().get(0)));
    stringBuffer.append(TEXT_51);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) { GenFeature reverseFeature = genFeature.getReverse();
    if (reverseFeature != null && reverseFeature.getGenClass().hasOffsetCorrection()) {
    stringBuffer.append(TEXT_117);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_118);
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genClass.getOffsetCorrectionField(genFeature));
    stringBuffer.append(TEXT_82);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_115);
    stringBuffer.append(reverseFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_116);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_51);
    }
    }
    }
    if (genModel.isOperationReflection() && isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genClass.getImplementedGenOperations().get(0).getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genClass.getQualifiedOperationID(genClass.getImplementedGenOperations().get(0)));
    stringBuffer.append(TEXT_51);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_42);
    if (genModel.isPublicConstructors()) {
    stringBuffer.append(TEXT_122);
    } else {
    stringBuffer.append(TEXT_123);
    }
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_124);
    for (GenFeature genFeature : genClass.getFlagGenFeaturesWithDefault()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_127);
    if (!genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_2);
    }
    stringBuffer.append(TEXT_129);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_132);
    }
    if (isImplementation && genModel.isDynamicDelegation()) {
    }
    if (isImplementation && (genModel.getFeatureDelegation() == GenDelegationKind.REFLECTIVE_LITERAL || genModel.isDynamicDelegation()) && (genClass.getClassExtendsGenClass() == null || (genClass.getClassExtendsGenClass().getGenModel().getFeatureDelegation() != GenDelegationKind.REFLECTIVE_LITERAL && !genClass.getClassExtendsGenClass().getGenModel().isDynamicDelegation()))) {
    if (genClass.hasStaticFeatures()) {
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? 0 : genClass.getClassExtendsGenClass().getAllGenFeatures().size());
    stringBuffer.append(TEXT_51);
    }
    stringBuffer.append(TEXT_134);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? "0" : genClass.hasStaticFeatures() ? "ESTATIC_FEATURE_COUNT" : Integer.toString(genClass.getClassExtendsGenClass().getAllGenFeatures().size()));
    stringBuffer.append(TEXT_132);
    }
    //Class/reflectiveDelegation.override.javajetinc
    if (isImplementation) {
    new Runnable() { public void run() { GenClass classExtendsGenClass = genClass.getClassExtendsGenClass(); List<GenFeature> classExtendsAllGenFeatures = classExtendsGenClass == null? Collections.<GenFeature>emptyList() : classExtendsGenClass.getAllGenFeatures();
    for (GenFeature genFeature : genClass.getReifiedGenFeatures()) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String arrayElementType = genFeature.getArrayItemType(genClass);
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_21);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_118);
    if (genModel.useGenerics() && CodeGenUtil.isUncheckedCast(arrayElementType)) {
    stringBuffer.append(TEXT_79);
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    if (useInterfaceOverrideAnnotation || classExtendsAllGenFeatures.contains(genFeature)) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_137);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_138);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_141);
    } else {
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2);
    }
    stringBuffer.append(TEXT_146);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_147);
    }
    if (genFeature.isGet() && genFeature.isListType()) {
    stringBuffer.append(TEXT_148);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_118);
    if (isJDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    }
    if (genFeature.isListType() && genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_79);
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    if (useInterfaceOverrideAnnotation || classExtendsAllGenFeatures.contains(genFeature)) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getGetAccessor());
    if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_149);
    }
    stringBuffer.append(TEXT_138);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_152);
    }
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_153);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_154);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_152);
    } else {
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_2);
    }
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_132);
    }
    if (!genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_159);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_118);
    if (isJDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    if (classExtendsAllGenFeatures.contains(genFeature)) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_161);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_162);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_164);
    }
    if (genFeature.isSet() && !(!genModel.isReflectiveDelegation() && genFeature.isBasicSet())) {
    stringBuffer.append(TEXT_159);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_118);
    if (isJDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    }
    { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    if (classExtendsAllGenFeatures.contains(genFeature)) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_149);
    }
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_149);
    }
    stringBuffer.append(TEXT_99);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_167);
    }
    }
    //Class/genFeatureReified.override.javajetinc
    }}}.run();}
    new Runnable() { public void run() {
    for (GenFeature genFeature : (isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures())) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String arrayElementType = genFeature.getArrayItemType(genClass);
    stringBuffer.append(TEXT_117);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_118);
    if (!isImplementation) {
    stringBuffer.append(TEXT_168);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_169);
    } else {
    if (genModel.useGenerics() && CodeGenUtil.isUncheckedCast(arrayElementType)) {
    stringBuffer.append(TEXT_79);
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_137);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_138);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_141);
    } else {
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2);
    }
    stringBuffer.append(TEXT_146);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_117);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_118);
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_171);
    } else {
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_172);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_92);
    }
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_173);
    }
    stringBuffer.append(TEXT_117);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_118);
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_175);
    } else {
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_177);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_179);
    } else {
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_181);
    }
    stringBuffer.append(TEXT_182);
    }
    stringBuffer.append(TEXT_117);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_118);
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_183);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_185);
    } else {
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_167);
    }
    stringBuffer.append(TEXT_117);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_118);
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_183);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_190);
    } else {
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_191);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_192);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_193);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_194);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_195);
    if (genFeature.isListType() && genFeature.getEcoreFeature().getEGenericType().getETypeParameter() == null) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_196);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_197);
    stringBuffer.append(keyFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_198);
    } else {
    stringBuffer.append(TEXT_199);
    stringBuffer.append(keyFeature.getType(genClass));
    stringBuffer.append(TEXT_198);
    }
    stringBuffer.append(TEXT_200);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_197);
    stringBuffer.append(valueFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_198);
    } else {
    stringBuffer.append(TEXT_199);
    stringBuffer.append(valueFeature.getType(genClass));
    stringBuffer.append(TEXT_198);
    }
    stringBuffer.append(TEXT_201);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType(genClass)))) {
String typeName = genFeature.getQualifiedListItemType(genClass); String head = typeName; String tail = ""; int index = typeName.indexOf('<'); if (index == -1) { index = typeName.indexOf('['); } 
if (index != -1) { head = typeName.substring(0, index); tail = "<code>" + CodeGenUtil.xmlEscapeEncode(typeName.substring(index)) + "</code>"; }

    stringBuffer.append(TEXT_202);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_198);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_195);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_203);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_204);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_206);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_207);
    stringBuffer.append(reverseGenFeature.getGenClass().getRawQualifiedInterfaceName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_208);
    }
    }
    stringBuffer.append(TEXT_209);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_211);
    }
    stringBuffer.append(TEXT_212);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_195);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_21);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_21);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_92);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_21);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_214);
    stringBuffer.append(reverseGenFeature.getGenClass().getRawQualifiedInterfaceName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_218);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_219);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_220);
    }}
    stringBuffer.append(TEXT_118);
    //Class/getGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_117);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_118);
    if (isJDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    }
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_169);
    } else {
    if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && genFeature.isUncheckedCast(genClass) || genFeature.isListType() && !genFeature.isFeatureMapType() && (genModel.isReflectiveDelegation() || genModel.isVirtualDelegation() || (genModel.isDynamicDelegation() && !genFeature.isVolatile())) || genFeature.isListDataType() && genFeature.hasDelegateFeature() || genFeature.isListType() && genFeature.hasSettingDelegate())) {
    stringBuffer.append(TEXT_79);
    }
    if (useInterfaceOverrideAnnotation && !genClass.isMapEntry() && !genClass.hasCollidingGetAccessorOperation(genFeature) && !genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getGetAccessor());
    if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_149);
    }
    stringBuffer.append(TEXT_138);
    if (genModel.isDynamicDelegation() && !genFeature.isVolatile()) {
    stringBuffer.append(TEXT_178);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_99);
    }
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_221);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genClass.hasStaticFeatures()){
    stringBuffer.append(TEXT_222);
    }
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_223);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_92);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_2);
    } else if (genModel.isReflectiveDelegation()) {
    if (genFeature.hasGetterBody()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getGetterBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_178);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_99);
    }
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_226);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_2);
    }
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_178);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_99);
    }
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_227);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_2);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_152);
    }
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_153);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_154);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_152);
    } else {
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_2);
    }
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_2);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_228);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_229);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_92);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_230);
    } else {
    stringBuffer.append(TEXT_231);
    }
    stringBuffer.append(TEXT_232);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_152);
    }
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getAsInternalEObject(genFeature.getSafeName(), false));
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_237);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_238);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_239);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_240);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_161);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getAsInternalEObject(genFeature.getSafeName(), false));
    stringBuffer.append(TEXT_2);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_244);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_245);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_246);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_155);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_247);
    }
    stringBuffer.append(TEXT_248);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_249);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_250);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_251);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_252);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_253);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_254);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_155);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_255);
    }
    stringBuffer.append(TEXT_256);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_257);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_152);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_262);
    }
    stringBuffer.append(TEXT_263);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_152);
    } else if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_266);
    } else {
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_269);
    }
    } else {
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_270);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_273);
    stringBuffer.append(genFeature.getAsInternalEObject(genFeature.getSafeName(), false));
    stringBuffer.append(TEXT_274);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = isJDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_275);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_279);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_280);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_262);
    } else {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_281);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_282);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_280);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_152);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_152);
    } else {
    stringBuffer.append(TEXT_285);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_286);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_152);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_178);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_99);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_92);
    }
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_226);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_2);
    } else {
    stringBuffer.append(TEXT_178);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_99);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_92);
    }
    stringBuffer.append(TEXT_288);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_226);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_2);
    }
    }
    } else if (genClass.getGetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genClass.getGetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else if (genFeature.hasGetterBody()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getGetterBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_292);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_293);
    if (genFeature.isMapType()) {
    stringBuffer.append(TEXT_294);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_295);
    } else {
    stringBuffer.append(TEXT_296);
    }
    stringBuffer.append(TEXT_297);
    }
    stringBuffer.append(TEXT_298);
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_182);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_117);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_118);
    if (isJDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_138);
    if (genModel.isDynamicDelegation() && !genFeature.isVolatile()) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_221);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genClass.hasStaticFeatures()){
    stringBuffer.append(TEXT_222);
    }
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_300);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_152);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_178);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_99);
    }
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_301);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_2);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_228);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_229);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_302);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_152);
    } else {
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_304);
    } else {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_281);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_304);
    }
    } else if (genFeature.hasGetterBody()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getGetterBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_305);
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_182);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_117);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_118);
    if (isJDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_161);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_306);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_307);
    stringBuffer.append(genFeature.getAsInternalEObject("new" + genFeature.getCapName(), false));
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_308);
    stringBuffer.append(TEXT_309);
    } else if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genFeature.getAsInternalEObject("new" + genFeature.getCapName(), false));
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_308);
    stringBuffer.append(TEXT_309);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_152);
    } else {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_317);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_320);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_321);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_323);
    }
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_324);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_325);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_155);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_155);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_330);
    } else {
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_332);
    }
    stringBuffer.append(TEXT_152);
    } else {
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_155);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_152);
    }
    stringBuffer.append(TEXT_334);
    }
    stringBuffer.append(TEXT_309);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_308);
    } else {
    stringBuffer.append(TEXT_283);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_336);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_308);
    }
    } else {
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_339);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_182);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_340);
    stringBuffer.append(genClass.getRawQualifiedInterfaceName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_195);
    stringBuffer.append(TEXT_341);
    if (isImplementation) {
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_343);
    }
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_195);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_21);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_21);
    }
    }
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_21);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_118);
    //Class/setGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_117);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_118);
    if (isJDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    }
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_183);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_346);
    } else { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    if (useInterfaceOverrideAnnotation && !genClass.isMapEntry() && !genClass.hasCollidingSetAccessorOperation(genFeature) && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_149);
    }
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_347);
    if (genModel.isDynamicDelegation() && !genFeature.isVolatile()) {
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genClass.hasStaticFeatures()){
    stringBuffer.append(TEXT_222);
    }
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_155);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_99);
    }
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_92);
    }
    stringBuffer.append(TEXT_152);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_350);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_155);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_99);
    }
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_92);
    }
    stringBuffer.append(TEXT_152);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_351);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_99);
    }
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_92);
    }
    stringBuffer.append(TEXT_152);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_354);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_355);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_356);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_357);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genFeature.getAsInternalEObject("new" + genFeature.getCapName(), true));
    stringBuffer.append(TEXT_254);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_155);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_362);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_262);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_152);
    }
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_367);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genFeature.getAsInternalEObject(genFeature.getSafeName(), true));
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_369);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genFeature.getAsInternalEObject("new" + genFeature.getCapName(), true));
    stringBuffer.append(TEXT_251);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_252);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genFeature.getAsInternalEObject(genFeature.getSafeName(), true));
    stringBuffer.append(TEXT_246);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_155);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genFeature.getAsInternalEObject("new" + genFeature.getCapName(), true));
    stringBuffer.append(TEXT_254);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_155);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_255);
    }
    stringBuffer.append(TEXT_371);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_362);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_372);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_152);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_320);
    }
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_321);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_323);
    }
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_324);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_375);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_377);
    }
    stringBuffer.append(TEXT_378);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_262);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_266);
    } else {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_269);
    }
    }
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_382);
    } else {
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_383);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_385);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_386);
    if (isJDK50) {
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_90);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_92);
    }
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_388);
    }
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_390);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2);
    } else {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_390);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2);
    } else {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_152);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_317);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_320);
    }
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_321);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_323);
    }
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_324);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_155);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_155);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_155);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_330);
    } else {
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_332);
    }
    stringBuffer.append(TEXT_262);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_155);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_155);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_262);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_155);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_99);
    }
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_92);
    }
    stringBuffer.append(TEXT_152);
    } else {
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_336);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_397);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_155);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_99);
    }
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_92);
    }
    stringBuffer.append(TEXT_152);
    }
    } else if (setAccessorOperation != null) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(setAccessorOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_399);
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_182);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_117);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_118);
    if (isJDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_306);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genFeature.getAsInternalEObject("", false));
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_308);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_82);
    }
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_152);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2);
    }
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_406);
    }
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_407);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_320);
    }
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_321);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_323);
    }
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_408);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_409);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_155);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_412);
    } else {
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_413);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_330);
    } else {
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_332);
    }
    stringBuffer.append(TEXT_414);
    }
    } else {
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_339);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_182);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_416);
    stringBuffer.append(genClass.getRawQualifiedInterfaceName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_195);
    stringBuffer.append(TEXT_209);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_21);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_92);
    }
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_118);
    //Class/unsetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_117);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_118);
    if (isJDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    }
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_169);
    } else {
    if (useInterfaceOverrideAnnotation && !genClass.isMapEntry() && !genClass.hasCollidingUnsetAccessorOperation(genFeature) && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingUnsetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_149);
    }
    stringBuffer.append(TEXT_138);
    if (genModel.isDynamicDelegation() && !genFeature.isVolatile()) {
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genClass.hasStaticFeatures()){
    stringBuffer.append(TEXT_222);
    }
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_152);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_152);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_421);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_152);
    }
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_422);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_423);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_424);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_152);
    }
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_426);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_427);
    stringBuffer.append(genFeature.getAsInternalEObject(genFeature.getSafeName(), true));
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_252);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_427);
    stringBuffer.append(genFeature.getAsInternalEObject(genFeature.getSafeName(), true));
    stringBuffer.append(TEXT_246);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_155);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_255);
    }
    stringBuffer.append(TEXT_428);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_429);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_152);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_320);
    }
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_321);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_323);
    }
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_408);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_375);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_377);
    }
    stringBuffer.append(TEXT_378);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_266);
    } else {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_269);
    }
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_431);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_152);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2);
    }
    }
    if (!genModel.isSuppressNotification()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_407);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_320);
    } else {
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_323);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_406);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_321);
    } else {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_408);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_155);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_412);
    } else {
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_413);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_330);
    } else {
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_332);
    }
    stringBuffer.append(TEXT_262);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_382);
    } else {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_385);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_432);
    }
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_321);
    } else {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_408);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_155);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_433);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_155);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_330);
    } else {
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_332);
    }
    stringBuffer.append(TEXT_262);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_152);
    } else {
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_336);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_152);
    }
    } else if (genClass.getUnsetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genClass.getUnsetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_399);
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_182);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genClass.getRawQualifiedInterfaceName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_438);
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_438);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_21);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_92);
    }
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_118);
    //Class/isSetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_117);
    if (genFeature.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genFeature.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_118);
    if (isJDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    }
    }
    if (isJDK50 && genFeature.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_169);
    } else {
    if (useInterfaceOverrideAnnotation  && !genClass.isMapEntry() && !genClass.hasCollidingIsSetAccessorOperation(genFeature) && !genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingIsSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_149);
    }
    stringBuffer.append(TEXT_138);
    if (genModel.isDynamicDelegation() && !genFeature.isVolatile()) {
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genClass.hasStaticFeatures()){
    stringBuffer.append(TEXT_222);
    }
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_152);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_152);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_444);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_152);
    }
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_423);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_446);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_152);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_320);
    } else {
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_323);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_449);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_152);
    } else {
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_336);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_152);
    }
    } else if (genClass.getIsSetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genClass.getIsSetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_452);
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_182);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    if (isImplementation) {
    if (genOperation.isInvariant() && genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_92);
    if (genOperation.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genOperation.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_60);
    if (isJDK50 && genOperation.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genOperation.getInvariantExpression("\t\t"));
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_4);
    } else if (genOperation.hasInvocationDelegate()) {
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_92);
    if (genOperation.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genOperation.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_60);
    if (isJDK50 && genOperation.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_459);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_461);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_462);
    stringBuffer.append(TEXT_209);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_463);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_211);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_218);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_219);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_220);
    }}
    stringBuffer.append(TEXT_118);
    //Class/genOperation.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_117);
    if (genOperation.hasAPITags()) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genOperation.getAPITags(genModel.getIndentation(stringBuffer)));
    }
    stringBuffer.append(TEXT_118);
    if (isJDK50) { //Class/genOperation.annotations.insert.javajetinc
    }
    }
    if (isJDK50 && genOperation.hasAPIDeprecatedTag()) {
    stringBuffer.append(TEXT_61);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_51);
    } else {
    if (genModel.useGenerics() && !genOperation.hasBody() && !genOperation.isInvariant() && genOperation.hasInvocationDelegate() && genOperation.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_79);
    }
    if (useInterfaceOverrideAnnotation && !genClass.isMapEntry() && !genOperation.isSuppressedVisibility()) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genOperation.getParameters(isImplementation, genClass));
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_466);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_467);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_469);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_470);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_471);
    stringBuffer.append(genOperation.getValidationDelegate());
    stringBuffer.append(TEXT_472);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_473);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_470);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_475);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_476);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_195);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_152);
    } else {
    stringBuffer.append(TEXT_477);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_478);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_479);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_480);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_481);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_482);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_195);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_485);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_486);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_487);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_488);
    }
    } else if (genOperation.hasInvocationDelegate()) { int size = genOperation.getGenParameters().size();
    stringBuffer.append(TEXT_489);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_157);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_490);
    if (size > 0) {
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_491);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_92);
    } else {
    stringBuffer.append(TEXT_492);
    }
    stringBuffer.append(TEXT_152);
    } else {
    stringBuffer.append(TEXT_493);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_99);
    }
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_92);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_490);
    if (size > 0) {
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_491);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_92);
    } else {
    stringBuffer.append(TEXT_492);
    }
    stringBuffer.append(TEXT_92);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_2);
    }
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_495);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.WrappedException"));
    stringBuffer.append(TEXT_496);
    } else {
    stringBuffer.append(TEXT_497);
    //Class/implementedGenOperation.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_182);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_134);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_79);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_500);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_501);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_503);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_504);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_506);
    } else {
    stringBuffer.append(TEXT_507);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_508);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_509);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_511);
    } else {
    stringBuffer.append(TEXT_512);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_308);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_152);
    } else if (genFeature.isVolatile() || genClass.getImplementingGenModel(genFeature).isDynamicDelegation()) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_82);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_232);
    }
    stringBuffer.append(TEXT_513);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_367);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_514);
    stringBuffer.append(genFeature.getAsInternalEObject(genFeature.getSafeName(), true));
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_252);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_514);
    stringBuffer.append(genFeature.getAsInternalEObject(genFeature.getSafeName(), true));
    stringBuffer.append(TEXT_246);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_155);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_255);
    }
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_511);
    }
    }
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_515);
    } else {
    stringBuffer.append(TEXT_378);
    }
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_516);
    } else {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_517);
    }
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_378);
    }
    stringBuffer.append(TEXT_182);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_134);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_500);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_501);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_503);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_504);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_519);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_504);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_521);
    } else {
    stringBuffer.append(TEXT_504);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_522);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_308);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_525);
    } else {
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_526);
    }
    }
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_515);
    } else { // {
    stringBuffer.append(TEXT_378);
    }
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_527);
    } else {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_528);
    }
    if (forceDefaultCase) { // {
    stringBuffer.append(TEXT_378);
    } // }
    stringBuffer.append(TEXT_182);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_134);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_530);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_501);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_531);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_155);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_255);
    }
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_515);
    } else { // {
    stringBuffer.append(TEXT_378);
    }
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_532);
    } else {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_533);
    }
    if (forceDefaultCase) { // {
    stringBuffer.append(TEXT_378);
    } // }
    stringBuffer.append(TEXT_182);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_134);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_534);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_501);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_503);
    if (genFeature.isPrimitiveType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_232);
    } else if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_536);
    } else {
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_538);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_539);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_232);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_541);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_232);
    } else {
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_545);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_541);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_232);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_547);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_548);
    } else {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_232);
    }
    }
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_515);
    } else { // {
    stringBuffer.append(TEXT_378);
    }
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_549);
    } else {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_550);
    }
    if (forceDefaultCase) { // {
    stringBuffer.append(TEXT_378);
    } // }
    stringBuffer.append(TEXT_182);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_134);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass) && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_79);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_551);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_501);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_503);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_553);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_554);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_556);
    } else {
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_554);
    }
    } else {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_559);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (isJDK50) {
    stringBuffer.append(TEXT_560);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_561);
    }
    stringBuffer.append(TEXT_562);
    }
    } else if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_563);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_564);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_565);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_538);
    } else {
    stringBuffer.append(TEXT_563);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_99);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType(genClass))) {
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_92);
    }
    stringBuffer.append(TEXT_566);
    }
    stringBuffer.append(TEXT_567);
    }
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_515);
    } else { // {
    stringBuffer.append(TEXT_378);
    }
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_568);
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_567);
    }
    } else {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_569);
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_567);
    }
    }
    if (forceDefaultCase) { // {
    stringBuffer.append(TEXT_378);
    } // }
    stringBuffer.append(TEXT_182);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_134);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_570);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_501);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_503);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_571);
    } else {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_572);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_573);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_232);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_563);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_574);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_421);
    } else {
    stringBuffer.append(TEXT_563);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_152);
    }
    stringBuffer.append(TEXT_567);
    }
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_515);
    } else { // {
    stringBuffer.append(TEXT_378);
    }
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_575);
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_567);
    }
    } else {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_576);
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_567);
    }
    }
    if (forceDefaultCase) { // {
    stringBuffer.append(TEXT_378);
    } // }
    stringBuffer.append(TEXT_182);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_134);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    if (genFeature.isListType() && !genFeature.isUnsettable() && !genFeature.isWrappedFeatureMapType() && !genClass.isField(genFeature) && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_79);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_577);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_501);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) { String safeNameAccessor = genFeature.getSafeName(); if ("featureID".equals(safeNameAccessor)) { safeNameAccessor = "this." + safeNameAccessor; }
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_503);
    if (genFeature.hasSettingDelegate()) {
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_232);
    } else {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_444);
    }
    } else if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_579);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_580);
    } else {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_581);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_582);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_581);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_583);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_584);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_581);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_583);
    } else {
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_586);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_232);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_587);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_588);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_589);
    } else {
    stringBuffer.append(TEXT_590);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_591);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_587);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_588);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_589);
    } else {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_591);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_504);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2);
    } else {
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_432);
    }
    } else {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_588);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2);
    } else {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_595);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_596);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_597);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_152);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_596);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_597);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_152);
    } else {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_598);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_597);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_538);
    }
    }
    }
    }
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_515);
    } else { // {
    stringBuffer.append(TEXT_378);
    }
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_599);
    } else {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_600);
    }
    if (forceDefaultCase) { // {
    stringBuffer.append(TEXT_378);
    } // }
    stringBuffer.append(TEXT_182);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && (!genClass.getMixinGenFeatures().isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty())) {
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_134);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_601);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_602);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_603);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_604);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_240);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_606);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2);
    }
    stringBuffer.append(TEXT_607);
    }
    stringBuffer.append(TEXT_608);
    }
    stringBuffer.append(TEXT_609);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_610);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_602);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_603);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_611);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_605);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_606);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2);
    }
    stringBuffer.append(TEXT_607);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_603);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_612);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_240);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_606);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2);
    }
    stringBuffer.append(TEXT_607);
    }
    stringBuffer.append(TEXT_613);
    }
    if (genModel.isOperationReflection() && isImplementation && (!genClass.getMixinGenOperations().isEmpty() || !genClass.getOverrideGenOperations(genClass.getExtendedGenOperations(), genClass.getImplementedGenOperations()).isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty())) {
    stringBuffer.append(TEXT_134);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_614);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_602);
    for (GenClass extendedGenClass : genClass.getExtendedGenClasses()) { List<GenOperation> extendedImplementedGenOperations = extendedGenClass.getImplementedGenOperations(); List<GenOperation> implementedGenOperations = genClass.getImplementedGenOperations();
    if (!genClass.getOverrideGenOperations(extendedImplementedGenOperations, implementedGenOperations).isEmpty()) {
    stringBuffer.append(TEXT_603);
    stringBuffer.append(extendedGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_615);
    for (GenOperation genOperation : extendedImplementedGenOperations) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    if (implementedGenOperations.contains(overrideGenOperation)) {
    stringBuffer.append(TEXT_605);
    stringBuffer.append(extendedGenClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_606);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2);
    }
    }
    stringBuffer.append(TEXT_616);
    }
    }
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_603);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_615);
    for (GenOperation genOperation : mixinGenClass.getGenOperations()) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    stringBuffer.append(TEXT_605);
    stringBuffer.append(mixinGenClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_606);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation != null ? overrideGenOperation : genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2);
    }
    stringBuffer.append(TEXT_607);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_603);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_617);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_240);
    for (GenOperation genOperation : genClass.getGenOperations()) {
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_606);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2);
    }
    stringBuffer.append(TEXT_607);
    }
    stringBuffer.append(TEXT_618);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_134);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_619);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_620);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_621);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_622);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_134);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_623);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_502);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_624);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2);
    }
    stringBuffer.append(TEXT_625);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_626);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_502);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_627);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_628);
    }
    stringBuffer.append(TEXT_629);
    }
    }
    }
    if (genModel.isOperationReflection() && isImplementation && !genClass.getImplementedGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_134);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_130);
    }
    if (genModel.useGenerics()) {
    boolean isUnchecked = false; boolean isRaw = false; LOOP: for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) { for (GenParameter genParameter : genOperation.getGenParameters()) { if (genParameter.isUncheckedCast()) { if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType()) { isUnchecked = true; } if (genParameter.usesOperationTypeParameters() && !genParameter.getEcoreParameter().getEGenericType().getETypeArguments().isEmpty()) { isRaw = true; break LOOP; }}}}
    if (isUnchecked) {
    stringBuffer.append(TEXT_630);
    if (!isRaw) {
    stringBuffer.append(TEXT_631);
    } else {
    stringBuffer.append(TEXT_632);
    }
    stringBuffer.append(TEXT_92);
    }
    }
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_634);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_635);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_501);
    for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) { List<GenParameter> genParameters = genOperation.getGenParameters(); int size = genParameters.size();  boolean hasCheckedException = genOperation.hasCheckedException(); String indent = hasCheckedException ? "\t" : ""; GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation != null ? overrideGenOperation : genOperation));
    stringBuffer.append(TEXT_503);
    if (hasCheckedException) {
    stringBuffer.append(TEXT_636);
    /*}*/}
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(indent);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_99);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_99);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.usesOperationTypeParameters() && !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genParameter.usesOperationTypeParameters() ? genParameter.getRawImportedType() : genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_92);
    }
    stringBuffer.append(TEXT_637);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_92);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_21);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_155);
    }
    }
    stringBuffer.append(TEXT_638);
    stringBuffer.append(indent);
    stringBuffer.append(TEXT_639);
    } else {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(indent);
    stringBuffer.append(TEXT_640);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_99);
    }
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_99);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_99);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.usesOperationTypeParameters() && !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genParameter.usesOperationTypeParameters() ? genParameter.getRawImportedType() : genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_92);
    }
    stringBuffer.append(TEXT_637);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_92);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_21);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_155);
    }
    }
    stringBuffer.append(TEXT_92);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_92);
    }
    stringBuffer.append(TEXT_2);
    }
    if (hasCheckedException) {/*{*/
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genModel.getImportedName("java.lang.Throwable"));
    stringBuffer.append(TEXT_642);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_643);
    }
    }
    if (forceDefaultCase) {
    stringBuffer.append(TEXT_515);
    } else { // {
    stringBuffer.append(TEXT_378);
    }
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_644);
    } else {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(indentDefaultCase);
    stringBuffer.append(TEXT_645);
    }
    if (forceDefaultCase) { // {
    stringBuffer.append(TEXT_378);
    } // }
    stringBuffer.append(TEXT_182);
    }
    if (!genClass.hasImplementedToStringGenOperation() && isImplementation && !genModel.isReflectiveDelegation() && !genModel.isDynamicDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_134);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genModel.useGenerics() ? "StringBuilder" : "StringBuffer");
    stringBuffer.append(TEXT_647);
    stringBuffer.append(genModel.useGenerics() ? "StringBuilder" : "StringBuffer");
    stringBuffer.append(TEXT_648);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_651);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_652);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_653);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_142);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_655);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_332);
    }
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_657);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_142);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_655);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_332);
    }
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_659);
    stringBuffer.append(genModel.getNonNLS());
    }
    } else {
    stringBuffer.append(TEXT_142);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_655);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_332);
    }
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_660);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_661);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_262);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_663);
    } else {
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_665);
    }
    } else {
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_152);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_666);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = isJDK50 ? keyFeature.getObjectType(genClass) : objectType;
    String valueType = isJDK50 ? valueFeature.getObjectType(genClass) : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (isJDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_134);
    if (isGWT) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_667);
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_668);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_669);
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_670);
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_137);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_671);
    if (!isJDK50 && keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_275);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_672);
    } else {
    stringBuffer.append(TEXT_673);
    }
    stringBuffer.append(TEXT_129);
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_674);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_675);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_676);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_92);
    }
    stringBuffer.append(TEXT_677);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_678);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_679);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_680);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_538);
    } else {
    stringBuffer.append(TEXT_681);
    stringBuffer.append(keyFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_682);
    }
    stringBuffer.append(TEXT_129);
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_137);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_683);
    if (!isJDK50 && valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_275);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_684);
    } else {
    stringBuffer.append(TEXT_685);
    }
    stringBuffer.append(TEXT_129);
    if (useInterfaceOverrideAnnotation) {
    stringBuffer.append(TEXT_130);
    }
    stringBuffer.append(TEXT_137);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_686);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_687);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_688);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_689);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_92);
    }
    stringBuffer.append(TEXT_690);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_691);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_692);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_693);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_538);
    } else {
    stringBuffer.append(TEXT_694);
    stringBuffer.append(valueFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_695);
    }
    stringBuffer.append(TEXT_696);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_79);
    }
    stringBuffer.append(TEXT_137);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_697);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_698);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_699);
    }
    stringBuffer.append(TEXT_700);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
