
package robLANG_ASOS.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import robLANG_ASOS.RobLANG_ASOSPackage;
import robLANG_ASOS.SenseDistance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sense Distance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link robLANG_ASOS.impl.SenseDistanceImpl#getSensorIndex <em>Sensor Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SenseDistanceImpl extends SensorImpl implements SenseDistance {

	/**
	 * The default value of the '{@link #getSensorIndex() <em>Sensor Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorIndex()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SENSOR_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSensorIndex() <em>Sensor Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorIndex()
	 * @generated
	 * @ordered
	 */
	protected Integer sensorIndex = SENSOR_INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SenseDistanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobLANG_ASOSPackage.Literals.SENSE_DISTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSensorIndex() {
		return sensorIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensorIndex(Integer newSensorIndex) {
		Integer oldSensorIndex = sensorIndex;
		sensorIndex = newSensorIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobLANG_ASOSPackage.SENSE_DISTANCE__SENSOR_INDEX,
					oldSensorIndex, sensorIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RobLANG_ASOSPackage.SENSE_DISTANCE__SENSOR_INDEX:
			return getSensorIndex();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RobLANG_ASOSPackage.SENSE_DISTANCE__SENSOR_INDEX:
			setSensorIndex((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RobLANG_ASOSPackage.SENSE_DISTANCE__SENSOR_INDEX:
			setSensorIndex(SENSOR_INDEX_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RobLANG_ASOSPackage.SENSE_DISTANCE__SENSOR_INDEX:
			return SENSOR_INDEX_EDEFAULT == null ? sensorIndex != null : !SENSOR_INDEX_EDEFAULT.equals(sensorIndex);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sensorIndex: ");
		result.append(sensorIndex);
		result.append(')');
		return result.toString();
	}

} //SenseDistanceImpl
