plugins {
    java
    `maven-publish`
}

group = "com.pauldaniv.one"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/pauldaniv/bom-seed")
        credentials {
            username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
            password = project.findProperty("gpr.key") as String? ?: System.getenv("GIT_HUB_TOKEN")
        }
    }
}

dependencies {
    implementation(platform("com.pauldaniv.template:bom:1.0.4"))
    testCompile("junit:junit:4.12")
    testCompile("org.assertj:assertj-core:3.15.0")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
