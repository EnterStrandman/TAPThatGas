package tapthatgas;

import tapthatgas.enums.EngineBoostType;
import tapthatgas.enums.EngineCylinders;
import tapthatgas.enums.Suspension;
import tapthatgas.enums.WeightClass;
import tapthatgas.enums.Wheels;

public class BaseCar {
    //declare member vars
    private Wheels _wheels;
    private EngineCylinders _engineCylinders;
    private EngineBoostType _engineBoostType;
    private Suspension _suspension;
    private WeightClass _weightClass;

    public BaseCar()
    {
        //no upgrades
        _wheels = Wheels.WHEELS_NONE;
        _engineCylinders = EngineCylinders.ENGINE_NONE;
        _engineBoostType = EngineBoostType.BOOST_TYPE_NONE;
        _suspension = Suspension.SUSPENSION_NONE;
        _weightClass = WeightClass.WEIGHT_CLASS_HEAVY;
    }

    public BaseCar(Wheels wheelSize, EngineCylinders engineSize, EngineBoostType boostType,
                   Suspension suspensionStiffness, WeightClass weightClass)
    {
        _wheels = wheelSize;
        _engineCylinders = engineSize;
        _engineBoostType = boostType;
        _suspension = suspensionStiffness;
        _weightClass = weightClass;
    }

    public Wheels get_wheels() {
        return _wheels;
    }

    public void set_wheels(Wheels _wheels) {
        this._wheels = _wheels;
    }

    public EngineCylinders get_engineCylinders() {
        return _engineCylinders;
    }

    public void set_engineCylinders(EngineCylinders _engineCylinders) {
        this._engineCylinders = _engineCylinders;
    }

    public EngineBoostType get_engineBoostType() {
        return _engineBoostType;
    }

    public void set_engineBoostType(EngineBoostType _engineBoostType) {
        this._engineBoostType = _engineBoostType;
    }

    public Suspension get_suspension() {
        return _suspension;
    }

    public void set_suspension(Suspension _suspension) {
        this._suspension = _suspension;
    }

    public WeightClass get_weightClass() {
        return _weightClass;
    }

    public void set_weightClass(WeightClass _weightClass) {
        this._weightClass = _weightClass;
    }
}
