class Config {

    static applicationId = 'com.example.template'
    static appName = 'TemplateProject'

    static compileSdkVersion = 27
    static minSdkVersion = 21
    static targetSdkVersion = 27
    static versionCode = 1_000_000
    static versionName = '1.0.0'

    static gradlePluginVersion = '3.5.0'
    static kotlinVersion = '1.3.50'

    static depConfig = [
            plugin_api        : "com.blankj.api",
            plugin_bus        : "com.blankj.bus",

            class_path_gradle : "com.android.tools.build:gradle:$gradlePluginVersion",
            class_path_kotlin : "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion",
            class_path_api    : "com.blankj:api-gradle-plugin:1.2",
            class_path_bus    : "com.blankj:bus-gradle-plugin:2.4",

            kotlin            : "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion",
            utilcode          : "com.blankj:utilcode:1.28.0",
            free_proguard     : "com.blankj:free-proguard:1.0.1",

            super_adapter     : "com.dengzii:superadapter:1.3.0",
            android_ktx       : "com.dengzii:android_ktx:1.1.0",
            leakcanary_android: "com.squareup.leakcanary:leakcanary-android:2.1",
    ]
}