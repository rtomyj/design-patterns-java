val lombokVersion = "1.18.26"

val SINGLETON_MAIN_CLASS = "com.rtomyj.design.patterns.singleton.SingletonMain"
val PROTOTYYPE_MAIN_CLASS = "com.rtomyj.design.patterns.prototype.PrototypeMain"
val FACTORY_MAIN_CLASS = "com.rtomyj.design.patterns.factory.FactoryMain"
val ITERATOR_MAIN_CLASS = "com.rtomyj.design.patterns.iterator.IteratorMain"


plugins {
    java
    application
}


repositories {
    jcenter()
}


dependencies {
    annotationProcessor("org.projectlombok:lombok:$lombokVersion")	// needed to compile via gradle CLI
    implementation("org.projectlombok:lombok:$lombokVersion")	// plug in required to work in VSCode, might be the same for other IDE's


    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
}


application {
    // Define the main class for the application.
    mainClassName = FACTORY_MAIN_CLASS
}


val test by tasks.getting(Test::class) {
    useJUnitPlatform()
}
