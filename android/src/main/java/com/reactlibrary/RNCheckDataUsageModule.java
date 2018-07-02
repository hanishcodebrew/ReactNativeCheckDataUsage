
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import java.text.DecimalFormat;
import android.net.TrafficStats;

public class RNCheckDataUsageModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNCheckDataUsageModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @ReactMethod
  public void checkDataUsage(final Promise promise) {
   try {
    promise.resolve(""+android.net.TrafficStats.getTotalRxBytes());
  } catch (Exception ex) {
    promise.reject("ERR_UNEXPECTED_EXCEPTION", ex);
  }
  }

  @Override
  public String getName() {
    return "RNCheckDataUsage";
  }

  public static String getFileSize(long size) {
    if (size <= 0)
        return "0";
    final String[] units = new String[] { "B", "KB", "MB", "GB", "TB" };
    int digitGroups = (int) (Math.log10(size) / Math.log10(1024));
    return new DecimalFormat("#,##0.#").format(size / Math.pow(1024, digitGroups)) + " " + units[digitGroups];
}
}