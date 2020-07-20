group = "com.pauldaniv.one"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(platform("com.paul:bom:0.0.1"))
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
