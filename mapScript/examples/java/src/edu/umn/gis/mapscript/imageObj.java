/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.umn.gis.mapscript;

public class imageObj {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected imageObj(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(imageObj obj) {
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
        mapscriptJNI.delete_imageObj(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int getWidth() {
    return mapscriptJNI.imageObj_width_get(swigCPtr, this);
  }

  public int getHeight() {
    return mapscriptJNI.imageObj_height_get(swigCPtr, this);
  }

  public double getResolution() {
    return mapscriptJNI.imageObj_resolution_get(swigCPtr, this);
  }

  public double getResolutionfactor() {
    return mapscriptJNI.imageObj_resolutionfactor_get(swigCPtr, this);
  }

  public String getImagepath() {
    return mapscriptJNI.imageObj_imagepath_get(swigCPtr, this);
  }

  public String getImageurl() {
    return mapscriptJNI.imageObj_imageurl_get(swigCPtr, this);
  }

  public outputFormatObj getFormat() {
    long cPtr = mapscriptJNI.imageObj_format_get(swigCPtr, this);
    return (cPtr == 0) ? null : new outputFormatObj(cPtr, false);
  }

  public imageObj(int width, int height, outputFormatObj input_format, String file, double resolution, double defresolution) {
    this(mapscriptJNI.new_imageObj(width, height, outputFormatObj.getCPtr(input_format), input_format, file, resolution, defresolution), true);
  }

  public void save(String filename, mapObj map) {
    mapscriptJNI.imageObj_save(swigCPtr, this, filename, mapObj.getCPtr(map), map);
  }

  public int write(SWIGTYPE_p_FILE file) {
    return mapscriptJNI.imageObj_write(swigCPtr, this, SWIGTYPE_p_FILE.getCPtr(file));
  }

  public byte[] getBytes() {
    return mapscriptJNI.imageObj_getBytes(swigCPtr, this);
}

  public int getSize() {
    return mapscriptJNI.imageObj_getSize(swigCPtr, this);
  }

}