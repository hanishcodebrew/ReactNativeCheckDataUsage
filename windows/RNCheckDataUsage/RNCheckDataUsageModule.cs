using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Check.Data.Usage.RNCheckDataUsage
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNCheckDataUsageModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNCheckDataUsageModule"/>.
        /// </summary>
        internal RNCheckDataUsageModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNCheckDataUsage";
            }
        }
    }
}
