package fun.fifu.tool.player_backup.pojo;

import lombok.Data;

@Data
public class ConfigPojo {
    String mongodb_uri;
    String mongodb_database;
    String mongodb_collection;
    String world_playerdata_path;
    String uuid2name_path;
}
