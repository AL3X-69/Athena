plugins {
    id("java")
    id("application")
}

group = "dev.alex6.athena"
version = "0.0.1-alpha.1"

application {
    mainClass = "dev.alex6.athena.potato.Main"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("net.dv8tion:JDA:5.0.0-beta.22")
    testImplementation(platform("org.junit:junit-bom:5.10.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}