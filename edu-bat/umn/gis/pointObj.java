package edu.umn.gis;
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

public class pointObj {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected pointObj(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pointObj obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mapscriptJNI.delete_pointObj(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX(double value) {
    mapscriptJNI.pointObj_x_set(swigCPtr, this, value);
  }

  public double getX() {
    return mapscriptJNI.pointObj_x_get(swigCPtr, this);
  }

  public void setY(double value) {
    mapscriptJNI.pointObj_y_set(swigCPtr, this, value);
  }

  public double getY() {
    return mapscriptJNI.pointObj_y_get(swigCPtr, this);
  }

  public int project(projectionObj projin, projectionObj projout) {
    return mapscriptJNI.pointObj_project(swigCPtr, this, projectionObj.getCPtr(projin), projin,
        projectionObj.getCPtr(projout), projout);
  }

  public int draw(mapObj map, layerObj layer, imageObj image, int classindex, String text) {
    return mapscriptJNI.pointObj_draw(swigCPtr, this, mapObj.getCPtr(map), map, layerObj.getCPtr(layer), layer,
        imageObj.getCPtr(image), image, classindex, text);
  }

  public double distanceToPoint(pointObj point) {
    return mapscriptJNI.pointObj_distanceToPoint(swigCPtr, this, pointObj.getCPtr(point), point);
  }

  public double distanceToSegment(pointObj a, pointObj b) {
    return mapscriptJNI.pointObj_distanceToSegment(swigCPtr, this, pointObj.getCPtr(a), a, pointObj.getCPtr(b), b);
  }

  public double distanceToShape(shapeObj shape) {
    return mapscriptJNI.pointObj_distanceToShape(swigCPtr, this, shapeObj.getCPtr(shape), shape);
  }

  public int setXY(double x, double y, double m) {
    return mapscriptJNI.pointObj_setXY(swigCPtr, this, x, y, m);
  }

  public int setXYZ(double x, double y, double z, double m) {
    return mapscriptJNI.pointObj_setXYZ(swigCPtr, this, x, y, z, m);
  }

  public int setXYZM(double x, double y, double z, double m) {
    return mapscriptJNI.pointObj_setXYZM(swigCPtr, this, x, y, z, m);
  }

  public String toString() {
    return mapscriptJNI.pointObj_toString(swigCPtr, this);
  }

  public shapeObj toShape() {
    long cPtr = mapscriptJNI.pointObj_toShape(swigCPtr, this);
    return (cPtr == 0) ? null : new shapeObj(cPtr, true);
  }

  public pointObj(double x, double y, double z, double m) {
    this(mapscriptJNI.new_pointObj__SWIG_0(x, y, z, m), true);
  }

  public pointObj(double x, double y, double z) {
    this(mapscriptJNI.new_pointObj__SWIG_1(x, y, z), true);
  }

}