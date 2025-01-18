package dragon.me.chameleonAPI2.configuration;

import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigCreator

{
    public ConfigCreator(){

    }
    public void newConfig(File file) throws IOException {

        if (!file.exists()){
            file.createNewFile();
        }
    }
    public YamlConfiguration toYAMLConfig(File file){

        return YamlConfiguration.loadConfiguration(file);

    }
}
