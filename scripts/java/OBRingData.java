/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class OBRingData extends OBGenericData {
  private long swigCPtr;

  protected OBRingData(long cPtr, boolean cMemoryOwn) {
    super(openbabelJNI.SWIGOBRingDataUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OBRingData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      openbabelJNI.delete_OBRingData(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public OBRingData() {
    this(openbabelJNI.new_OBRingData__SWIG_0(), true);
  }

  public OBRingData(OBRingData arg0) {
    this(openbabelJNI.new_OBRingData__SWIG_1(OBRingData.getCPtr(arg0), arg0), true);
  }

  public OBGenericData Clone(OBBase arg0) {
    long cPtr = openbabelJNI.OBRingData_Clone(swigCPtr, this, OBBase.getCPtr(arg0), arg0);
    return (cPtr == 0) ? null : new OBGenericData(cPtr, false);
  }

  public void SetData(vectorpRing vr) {
    openbabelJNI.OBRingData_SetData(swigCPtr, this, vectorpRing.getCPtr(vr), vr);
  }

  public void PushBack(OBRing r) {
    openbabelJNI.OBRingData_PushBack(swigCPtr, this, OBRing.getCPtr(r), r);
  }

  public vectorpRing GetData() {
    return new vectorpRing(openbabelJNI.OBRingData_GetData(swigCPtr, this), false);
  }

  public SWIGTYPE_p_std__vectorTOpenBabel__OBRing_p_t__iterator BeginRings() {
    return new SWIGTYPE_p_std__vectorTOpenBabel__OBRing_p_t__iterator(openbabelJNI.OBRingData_BeginRings(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__vectorTOpenBabel__OBRing_p_t__iterator EndRings() {
    return new SWIGTYPE_p_std__vectorTOpenBabel__OBRing_p_t__iterator(openbabelJNI.OBRingData_EndRings(swigCPtr, this), true);
  }

  public OBRing BeginRing(SWIGTYPE_p_std__vectorTOpenBabel__OBRing_p_t__iterator i) {
    long cPtr = openbabelJNI.OBRingData_BeginRing(swigCPtr, this, SWIGTYPE_p_std__vectorTOpenBabel__OBRing_p_t__iterator.getCPtr(i));
    return (cPtr == 0) ? null : new OBRing(cPtr, false);
  }

  public OBRing NextRing(SWIGTYPE_p_std__vectorTOpenBabel__OBRing_p_t__iterator i) {
    long cPtr = openbabelJNI.OBRingData_NextRing(swigCPtr, this, SWIGTYPE_p_std__vectorTOpenBabel__OBRing_p_t__iterator.getCPtr(i));
    return (cPtr == 0) ? null : new OBRing(cPtr, false);
  }

}
