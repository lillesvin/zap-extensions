version = "0.3.0"
description = "Retire.js"

zapAddOn {
    addOnName.set("Retire.js")
    zapVersion.set("2.9.0")

    manifest {
        author.set("Nikita Mundhada and the ZAP Dev Team")
        bundle {
            baseName.set("org.zaproxy.addon.retire.resources.Messages")
            prefix.set("retire")
        }
        helpSet {
            baseName.set("org.zaproxy.addon.retire.resources.help%LC%.helpset")
            localeToken.set("%LC%")
        }
    }
}

dependencies {
        implementation("com.google.code.gson:gson:2.8.6")

        testImplementation(project(":testutils"))
}
