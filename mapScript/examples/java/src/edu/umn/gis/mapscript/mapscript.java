/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.umn.gis.mapscript;

public class mapscript implements mapscriptConstants {
  public static int msSaveImage(mapObj map, imageObj img, String filename) {
    return mapscriptJNI.msSaveImage(mapObj.getCPtr(map), map, imageObj.getCPtr(img), img, filename);
  }

  public static void msFreeImage(imageObj img) {
    mapscriptJNI.msFreeImage(imageObj.getCPtr(img), img);
  }

  public static int msSetup() {
    return mapscriptJNI.msSetup();
  }

  public static void msCleanup() {
    mapscriptJNI.msCleanup();
  }

  public static mapObj msLoadMapFromString(String buffer, String new_mappath, configObj config) {
    long cPtr = mapscriptJNI.msLoadMapFromString(buffer, new_mappath, configObj.getCPtr(config), config);
    return (cPtr == 0) ? null : new mapObj(cPtr, true);
  }

  public static errorObj msGetErrorObj() {
    long cPtr = mapscriptJNI.msGetErrorObj();
    return (cPtr == 0) ? null : new errorObj(cPtr, false);
  }

  public static void msResetErrorList() {
    mapscriptJNI.msResetErrorList();
  }

  public static String msGetVersion() {
    return mapscriptJNI.msGetVersion();
  }

  public static int msGetVersionInt() {
    return mapscriptJNI.msGetVersionInt();
  }

  public static String msGetErrorString(String delimiter) {
    return mapscriptJNI.msGetErrorString(delimiter);
  }

  public static configObj msLoadConfig(String ms_config_file) {
    long cPtr = mapscriptJNI.msLoadConfig(ms_config_file);
    return (cPtr == 0) ? null : new configObj(cPtr, false);
  }

  public static void msFreeConfig(configObj config) {
    mapscriptJNI.msFreeConfig(configObj.getCPtr(config), config);
  }

  public static String msConfigGetEnv(configObj config, String key) {
    return mapscriptJNI.msConfigGetEnv(configObj.getCPtr(config), config, key);
  }

  public static String msConfigGetMap(configObj config, String key) {
    return mapscriptJNI.msConfigGetMap(configObj.getCPtr(config), config, key);
  }

  public static String msConfigGetPlugin(configObj config, String key) {
    return mapscriptJNI.msConfigGetPlugin(configObj.getCPtr(config), config, key);
  }

  public static void msConnPoolCloseUnreferenced() {
    mapscriptJNI.msConnPoolCloseUnreferenced();
  }

  public static void msIO_resetHandlers() {
    mapscriptJNI.msIO_resetHandlers();
  }

  public static void msIO_installStdoutToBuffer() {
    mapscriptJNI.msIO_installStdoutToBuffer();
  }

  public static void msIO_installStdinFromBuffer() {
    mapscriptJNI.msIO_installStdinFromBuffer();
  }

  public static String msIO_stripStdoutBufferContentType() {
    return mapscriptJNI.msIO_stripStdoutBufferContentType();
  }

  public static void msIO_stripStdoutBufferContentHeaders() {
    mapscriptJNI.msIO_stripStdoutBufferContentHeaders();
  }

  public static String msIO_getStdoutBufferString() {
    return mapscriptJNI.msIO_getStdoutBufferString();
  }

  public static byte[] msIO_getStdoutBufferBytes() {
    return mapscriptJNI.msIO_getStdoutBufferBytes();
}

  public static hashTableObj msIO_getAndStripStdoutBufferMimeHeaders() {
    long cPtr = mapscriptJNI.msIO_getAndStripStdoutBufferMimeHeaders();
    return (cPtr == 0) ? null : new hashTableObj(cPtr, true);
  }

}
