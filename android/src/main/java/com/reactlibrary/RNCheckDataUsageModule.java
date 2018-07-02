
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.widget.Toast;

public class RNCheckDataUsageModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNCheckDataUsageModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @ReactMethod
  public String checkDataUsage(String message) {
   return ""+getFileSize(android.net.TrafficStats.getTotalRxBytes());
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