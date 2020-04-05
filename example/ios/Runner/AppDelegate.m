#include "AppDelegate.h"
#include "GeneratedPluginRegistrant.h"
#include "MultiDownloaderPlugin.h"

@implementation AppDelegate

void registerPlugins(NSObject<FlutterPluginRegistry>* registry) {
    if (![registry hasPlugin:@"MultiDownloaderPlugin"]) {
        [MultiDownloaderPlugin registerWithRegistrar:[registry registrarForPlugin:@"MultiDownloaderPlugin"]];
    }
}

- (BOOL)application:(UIApplication *)application
    didFinishLaunchingWithOptions:(NSDictionary *)launchOptions {
  [GeneratedPluginRegistrant registerWithRegistry:self];
  [MultiDownloaderPlugin setPluginRegistrantCallback:registerPlugins];
  // Override point for customization after application launch.
  return [super application:application didFinishLaunchingWithOptions:launchOptions];
}

@end
