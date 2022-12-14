package edu.umn.gis;
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

public class styleObj {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected styleObj(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(styleObj obj) {
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
        mapscriptJNI.delete_styleObj(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int getRefcount() {
    return mapscriptJNI.styleObj_refcount_get(swigCPtr, this);
  }

  public void setAutoangle(int value) {
    mapscriptJNI.styleObj_autoangle_set(swigCPtr, this, value);
  }

  public int getAutoangle() {
    return mapscriptJNI.styleObj_autoangle_get(swigCPtr, this);
  }

  public void setColor(colorObj value) {
    mapscriptJNI.styleObj_color_set(swigCPtr, this, colorObj.getCPtr(value), value);
  }

  public colorObj getColor() {
    long cPtr = mapscriptJNI.styleObj_color_get(swigCPtr, this);
    return (cPtr == 0) ? null : new colorObj(cPtr, false);
  }

  public void setBackgroundcolor(colorObj value) {
    mapscriptJNI.styleObj_backgroundcolor_set(swigCPtr, this, colorObj.getCPtr(value), value);
  }

  public colorObj getBackgroundcolor() {
    long cPtr = mapscriptJNI.styleObj_backgroundcolor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new colorObj(cPtr, false);
  }

  public void setOutlinecolor(colorObj value) {
    mapscriptJNI.styleObj_outlinecolor_set(swigCPtr, this, colorObj.getCPtr(value), value);
  }

  public colorObj getOutlinecolor() {
    long cPtr = mapscriptJNI.styleObj_outlinecolor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new colorObj(cPtr, false);
  }

  public void setOpacity(int value) {
    mapscriptJNI.styleObj_opacity_set(swigCPtr, this, value);
  }

  public int getOpacity() {
    return mapscriptJNI.styleObj_opacity_get(swigCPtr, this);
  }

  public void setMincolor(colorObj value) {
    mapscriptJNI.styleObj_mincolor_set(swigCPtr, this, colorObj.getCPtr(value), value);
  }

  public colorObj getMincolor() {
    long cPtr = mapscriptJNI.styleObj_mincolor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new colorObj(cPtr, false);
  }

  public void setMaxcolor(colorObj value) {
    mapscriptJNI.styleObj_maxcolor_set(swigCPtr, this, colorObj.getCPtr(value), value);
  }

  public colorObj getMaxcolor() {
    long cPtr = mapscriptJNI.styleObj_maxcolor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new colorObj(cPtr, false);
  }

  public void setMinvalue(double value) {
    mapscriptJNI.styleObj_minvalue_set(swigCPtr, this, value);
  }

  public double getMinvalue() {
    return mapscriptJNI.styleObj_minvalue_get(swigCPtr, this);
  }

  public void setMaxvalue(double value) {
    mapscriptJNI.styleObj_maxvalue_set(swigCPtr, this, value);
  }

  public double getMaxvalue() {
    return mapscriptJNI.styleObj_maxvalue_get(swigCPtr, this);
  }

  public void setRangeitem(String value) {
    mapscriptJNI.styleObj_rangeitem_set(swigCPtr, this, value);
  }

  public String getRangeitem() {
    return mapscriptJNI.styleObj_rangeitem_get(swigCPtr, this);
  }

  public void setRangeitemindex(int value) {
    mapscriptJNI.styleObj_rangeitemindex_set(swigCPtr, this, value);
  }

  public int getRangeitemindex() {
    return mapscriptJNI.styleObj_rangeitemindex_get(swigCPtr, this);
  }

  public void setSymbol(int value) {
    mapscriptJNI.styleObj_symbol_set(swigCPtr, this, value);
  }

  public int getSymbol() {
    return mapscriptJNI.styleObj_symbol_get(swigCPtr, this);
  }

  public void setSymbolname(String value) {
    mapscriptJNI.styleObj_symbolname_set(swigCPtr, this, value);
  }

  public String getSymbolname() {
    return mapscriptJNI.styleObj_symbolname_get(swigCPtr, this);
  }

  public void setSize(double value) {
    mapscriptJNI.styleObj_size_set(swigCPtr, this, value);
  }

  public double getSize() {
    return mapscriptJNI.styleObj_size_get(swigCPtr, this);
  }

  public void setMinsize(double value) {
    mapscriptJNI.styleObj_minsize_set(swigCPtr, this, value);
  }

  public double getMinsize() {
    return mapscriptJNI.styleObj_minsize_get(swigCPtr, this);
  }

  public void setMaxsize(double value) {
    mapscriptJNI.styleObj_maxsize_set(swigCPtr, this, value);
  }

  public double getMaxsize() {
    return mapscriptJNI.styleObj_maxsize_get(swigCPtr, this);
  }

  public void setPatternlength(int value) {
    mapscriptJNI.styleObj_patternlength_set(swigCPtr, this, value);
  }

  public int getPatternlength() {
    return mapscriptJNI.styleObj_patternlength_get(swigCPtr, this);
  }

  public void setPattern(double[] value) {
    mapscriptJNI.styleObj_pattern_set(swigCPtr, this, value);
  }

  public double[] getPattern() {
    return mapscriptJNI.styleObj_pattern_get(swigCPtr, this);
  }

  public void setGap(double value) {
    mapscriptJNI.styleObj_gap_set(swigCPtr, this, value);
  }

  public double getGap() {
    return mapscriptJNI.styleObj_gap_get(swigCPtr, this);
  }

  public void setInitialgap(double value) {
    mapscriptJNI.styleObj_initialgap_set(swigCPtr, this, value);
  }

  public double getInitialgap() {
    return mapscriptJNI.styleObj_initialgap_get(swigCPtr, this);
  }

  public void setPosition(int value) {
    mapscriptJNI.styleObj_position_set(swigCPtr, this, value);
  }

  public int getPosition() {
    return mapscriptJNI.styleObj_position_get(swigCPtr, this);
  }

  public void setLinecap(int value) {
    mapscriptJNI.styleObj_linecap_set(swigCPtr, this, value);
  }

  public int getLinecap() {
    return mapscriptJNI.styleObj_linecap_get(swigCPtr, this);
  }

  public void setLinejoin(int value) {
    mapscriptJNI.styleObj_linejoin_set(swigCPtr, this, value);
  }

  public int getLinejoin() {
    return mapscriptJNI.styleObj_linejoin_get(swigCPtr, this);
  }

  public void setLinejoinmaxsize(double value) {
    mapscriptJNI.styleObj_linejoinmaxsize_set(swigCPtr, this, value);
  }

  public double getLinejoinmaxsize() {
    return mapscriptJNI.styleObj_linejoinmaxsize_get(swigCPtr, this);
  }

  public void setWidth(double value) {
    mapscriptJNI.styleObj_width_set(swigCPtr, this, value);
  }

  public double getWidth() {
    return mapscriptJNI.styleObj_width_get(swigCPtr, this);
  }

  public void setOutlinewidth(double value) {
    mapscriptJNI.styleObj_outlinewidth_set(swigCPtr, this, value);
  }

  public double getOutlinewidth() {
    return mapscriptJNI.styleObj_outlinewidth_get(swigCPtr, this);
  }

  public void setMinwidth(double value) {
    mapscriptJNI.styleObj_minwidth_set(swigCPtr, this, value);
  }

  public double getMinwidth() {
    return mapscriptJNI.styleObj_minwidth_get(swigCPtr, this);
  }

  public void setMaxwidth(double value) {
    mapscriptJNI.styleObj_maxwidth_set(swigCPtr, this, value);
  }

  public double getMaxwidth() {
    return mapscriptJNI.styleObj_maxwidth_get(swigCPtr, this);
  }

  public void setOffsetx(double value) {
    mapscriptJNI.styleObj_offsetx_set(swigCPtr, this, value);
  }

  public double getOffsetx() {
    return mapscriptJNI.styleObj_offsetx_get(swigCPtr, this);
  }

  public void setOffsety(double value) {
    mapscriptJNI.styleObj_offsety_set(swigCPtr, this, value);
  }

  public double getOffsety() {
    return mapscriptJNI.styleObj_offsety_get(swigCPtr, this);
  }

  public void setPolaroffsetpixel(double value) {
    mapscriptJNI.styleObj_polaroffsetpixel_set(swigCPtr, this, value);
  }

  public double getPolaroffsetpixel() {
    return mapscriptJNI.styleObj_polaroffsetpixel_get(swigCPtr, this);
  }

  public void setPolaroffsetangle(double value) {
    mapscriptJNI.styleObj_polaroffsetangle_set(swigCPtr, this, value);
  }

  public double getPolaroffsetangle() {
    return mapscriptJNI.styleObj_polaroffsetangle_get(swigCPtr, this);
  }

  public void setAngle(double value) {
    mapscriptJNI.styleObj_angle_set(swigCPtr, this, value);
  }

  public double getAngle() {
    return mapscriptJNI.styleObj_angle_get(swigCPtr, this);
  }

  public void setAntialias(int value) {
    mapscriptJNI.styleObj_antialias_set(swigCPtr, this, value);
  }

  public int getAntialias() {
    return mapscriptJNI.styleObj_antialias_get(swigCPtr, this);
  }

  public void setMinscaledenom(double value) {
    mapscriptJNI.styleObj_minscaledenom_set(swigCPtr, this, value);
  }

  public double getMinscaledenom() {
    return mapscriptJNI.styleObj_minscaledenom_get(swigCPtr, this);
  }

  public void setMaxscaledenom(double value) {
    mapscriptJNI.styleObj_maxscaledenom_set(swigCPtr, this, value);
  }

  public double getMaxscaledenom() {
    return mapscriptJNI.styleObj_maxscaledenom_get(swigCPtr, this);
  }

  public styleObj(classObj parent_class) {
    this(mapscriptJNI.new_styleObj(classObj.getCPtr(parent_class), parent_class), true);
  }

  public int updateFromString(String snippet) {
    return mapscriptJNI.styleObj_updateFromString(swigCPtr, this, snippet);
  }

  public styleObj cloneStyle() {
    long cPtr = mapscriptJNI.styleObj_cloneStyle(swigCPtr, this);
    return (cPtr == 0) ? null : new styleObj(cPtr, true);
  }

  public int setSymbolByName(mapObj map, String symbolname) {
    return mapscriptJNI.styleObj_setSymbolByName(swigCPtr, this, mapObj.getCPtr(map), map, symbolname);
  }

  public int removeBinding(int binding) {
    return mapscriptJNI.styleObj_removeBinding(swigCPtr, this, binding);
  }

  public int setBinding(int binding, String item) {
    return mapscriptJNI.styleObj_setBinding(swigCPtr, this, binding, item);
  }

  public String getBinding(int binding) {
    return mapscriptJNI.styleObj_getBinding(swigCPtr, this, binding);
  }

  public String getGeomTransform() {
    return mapscriptJNI.styleObj_getGeomTransform(swigCPtr, this);
  }

  public void setGeomTransform(String transform) {
    mapscriptJNI.styleObj_setGeomTransform(swigCPtr, this, transform);
  }

}
