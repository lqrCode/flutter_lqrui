package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.mr.flutter.plugin.filepicker.FilePickerPlugin;
import io.github.ponnamkarthik.toast.fluttertoast.FluttertoastPlugin;
import io.flutter.plugins.imagepicker.ImagePickerPlugin;
import com.vitanov.multiimagepicker.MultiImagePickerPlugin;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin;
import com.tekartik.sqflite.SqflitePlugin;
import io.flutter.plugins.urllauncher.UrlLauncherPlugin;
import com.lqrui.flutter_lqrui.FlutterLqruiPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    FilePickerPlugin.registerWith(registry.registrarFor("com.mr.flutter.plugin.filepicker.FilePickerPlugin"));
    FluttertoastPlugin.registerWith(registry.registrarFor("io.github.ponnamkarthik.toast.fluttertoast.FluttertoastPlugin"));
    ImagePickerPlugin.registerWith(registry.registrarFor("io.flutter.plugins.imagepicker.ImagePickerPlugin"));
    MultiImagePickerPlugin.registerWith(registry.registrarFor("com.vitanov.multiimagepicker.MultiImagePickerPlugin"));
    PathProviderPlugin.registerWith(registry.registrarFor("io.flutter.plugins.pathprovider.PathProviderPlugin"));
    SharedPreferencesPlugin.registerWith(registry.registrarFor("io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin"));
    SqflitePlugin.registerWith(registry.registrarFor("com.tekartik.sqflite.SqflitePlugin"));
    UrlLauncherPlugin.registerWith(registry.registrarFor("io.flutter.plugins.urllauncher.UrlLauncherPlugin"));
    FlutterLqruiPlugin.registerWith(registry.registrarFor("com.lqrui.flutter_lqrui.FlutterLqruiPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
