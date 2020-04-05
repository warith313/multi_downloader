#import <Flutter/Flutter.h>

@interface MultiDownloaderPlugin : NSObject<FlutterPlugin>

@property (nonatomic, copy) void(^backgroundTransferCompletionHandler)(void);

@end
