/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.umn.gis.mapscript;

public class symbolSetObj {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected symbolSetObj(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(symbolSetObj obj) {
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
        mapscriptJNI.delete_symbolSetObj(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int getNumsymbols() {
    return mapscriptJNI.symbolSetObj_numsymbols_get(swigCPtr, this);
  }

  public int getMaxsymbols() {
    return mapscriptJNI.symbolSetObj_maxsymbols_get(swigCPtr, this);
  }

  public void setFilename(String value) {
    mapscriptJNI.symbolSetObj_filename_set(swigCPtr, this, value);
  }

  public String getFilename() {
    return mapscriptJNI.symbolSetObj_filename_get(swigCPtr, this);
  }

  public void setImagecachesize(int value) {
    mapscriptJNI.symbolSetObj_imagecachesize_set(swigCPtr, this, value);
  }

  public int getImagecachesize() {
    return mapscriptJNI.symbolSetObj_imagecachesize_get(swigCPtr, this);
  }

  public symbolSetObj(String symbolfile) {
    this(mapscriptJNI.new_symbolSetObj(symbolfile), true);
  }

  public symbolObj getSymbol(int i) {
    long cPtr = mapscriptJNI.symbolSetObj_getSymbol(swigCPtr, this, i);
    return (cPtr == 0) ? null : new symbolObj(cPtr, true);
  }

  public symbolObj getSymbolByName(String symbolname) {
    long cPtr = mapscriptJNI.symbolSetObj_getSymbolByName(swigCPtr, this, symbolname);
    return (cPtr == 0) ? null : new symbolObj(cPtr, true);
  }

  public int index(String symbolname) {
    return mapscriptJNI.symbolSetObj_index(swigCPtr, this, symbolname);
  }

  public int appendSymbol(symbolObj symbol) {
    return mapscriptJNI.symbolSetObj_appendSymbol(swigCPtr, this, symbolObj.getCPtr(symbol), symbol);
  }

  public symbolObj removeSymbol(int index) {
    long cPtr = mapscriptJNI.symbolSetObj_removeSymbol(swigCPtr, this, index);
    return (cPtr == 0) ? null : new symbolObj(cPtr, true);
  }

  public int save(String filename) {
    return mapscriptJNI.symbolSetObj_save(swigCPtr, this, filename);
  }

}