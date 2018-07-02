
# react-native-check-data-usage

## Getting started

`$ npm install react-native-check-data-usage --save`

### Mostly automatic installation

`$ react-native link react-native-check-data-usage`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNCheckDataUsagePackage;` to the imports at the top of the file
  - Add `new RNCheckDataUsagePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-check-data-usage'
  	project(':react-native-check-data-usage').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-check-data-usage/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-check-data-usage')
  	```

## Usage
```javascript
import RNCheckDataUsage from 'react-native-check-data-usage';

// TODO: What to do with the module?
RNCheckDataUsage;
```
  