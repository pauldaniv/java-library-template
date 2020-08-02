group = "com.pauldaniv.one"
version = "1.0-SNAPSHOT"

dependencies {
  implementation("junit:junit")
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_8
}
