def listOfPlugins = []

println ("{")
Jenkins.instance.pluginManager.plugins.each{
    plugin ->
        listOfPlugins << plugin
}

size = listOfPlugins.size

for(i = 0; i < size; i++){
    println ("\t\"${listOfPlugins[i].getShortName()}\": {\n\t\t\"version\": \"${listOfPlugins[i].getVersion()}\"\n\t},")

    if((i + 1) == (size)){
        println ("\t\"${listOfPlugins[i].getShortName()}\": {\n\t\t\"version\": \"${listOfPlugins[i].getVersion()}\"\n\t}")
    }
}
println ("}")
