
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
  public void showToast(String message) {
    Toast.makeText(reactContext, message, 
    Toast.LENGTH_LONG).show();
  }
  
  @Override
  public String getName() {
    return "RNCheckDataUsage";
  }
}