/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.umn.gis.mapscript;

public final class MS_CONNECTION_TYPE {
  public final static MS_CONNECTION_TYPE MS_INLINE = new MS_CONNECTION_TYPE("MS_INLINE");
  public final static MS_CONNECTION_TYPE MS_SHAPEFILE = new MS_CONNECTION_TYPE("MS_SHAPEFILE");
  public final static MS_CONNECTION_TYPE MS_TILED_SHAPEFILE = new MS_CONNECTION_TYPE("MS_TILED_SHAPEFILE");
  public final static MS_CONNECTION_TYPE MS_UNUSED_2 = new MS_CONNECTION_TYPE("MS_UNUSED_2");
  public final static MS_CONNECTION_TYPE MS_OGR = new MS_CONNECTION_TYPE("MS_OGR");
  public final static MS_CONNECTION_TYPE MS_UNUSED_1 = new MS_CONNECTION_TYPE("MS_UNUSED_1");
  public final static MS_CONNECTION_TYPE MS_POSTGIS = new MS_CONNECTION_TYPE("MS_POSTGIS");
  public final static MS_CONNECTION_TYPE MS_WMS = new MS_CONNECTION_TYPE("MS_WMS");
  public final static MS_CONNECTION_TYPE MS_ORACLESPATIAL = new MS_CONNECTION_TYPE("MS_ORACLESPATIAL");
  public final static MS_CONNECTION_TYPE MS_WFS = new MS_CONNECTION_TYPE("MS_WFS");
  public final static MS_CONNECTION_TYPE MS_GRATICULE = new MS_CONNECTION_TYPE("MS_GRATICULE");
  public final static MS_CONNECTION_TYPE MS_MYSQL = new MS_CONNECTION_TYPE("MS_MYSQL");
  public final static MS_CONNECTION_TYPE MS_RASTER = new MS_CONNECTION_TYPE("MS_RASTER");
  public final static MS_CONNECTION_TYPE MS_PLUGIN = new MS_CONNECTION_TYPE("MS_PLUGIN");
  public final static MS_CONNECTION_TYPE MS_UNION = new MS_CONNECTION_TYPE("MS_UNION");
  public final static MS_CONNECTION_TYPE MS_UVRASTER = new MS_CONNECTION_TYPE("MS_UVRASTER");
  public final static MS_CONNECTION_TYPE MS_CONTOUR = new MS_CONNECTION_TYPE("MS_CONTOUR");
  public final static MS_CONNECTION_TYPE MS_KERNELDENSITY = new MS_CONNECTION_TYPE("MS_KERNELDENSITY");
  public final static MS_CONNECTION_TYPE MS_IDW = new MS_CONNECTION_TYPE("MS_IDW");
  public final static MS_CONNECTION_TYPE MS_FLATGEOBUF = new MS_CONNECTION_TYPE("MS_FLATGEOBUF");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static MS_CONNECTION_TYPE swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + MS_CONNECTION_TYPE.class + " with value " + swigValue);
  }

  private MS_CONNECTION_TYPE(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private MS_CONNECTION_TYPE(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private MS_CONNECTION_TYPE(String swigName, MS_CONNECTION_TYPE swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static MS_CONNECTION_TYPE[] swigValues = { MS_INLINE, MS_SHAPEFILE, MS_TILED_SHAPEFILE, MS_UNUSED_2, MS_OGR, MS_UNUSED_1, MS_POSTGIS, MS_WMS, MS_ORACLESPATIAL, MS_WFS, MS_GRATICULE, MS_MYSQL, MS_RASTER, MS_PLUGIN, MS_UNION, MS_UVRASTER, MS_CONTOUR, MS_KERNELDENSITY, MS_IDW, MS_FLATGEOBUF };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

