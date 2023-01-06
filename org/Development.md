# PyroDash Development

## Project Description

PyroDash is a PyroDoc editor written in Java. Similar to Vi(m) the application is controlled via modes (dash, browse, insert, term). Modes are toggled vias the gui or keybindings. Keybindings and the structure of the UI as well as colors (themes) can be controlled using configuration files. The behaivour the application can also be controlled using args on startup. The configuration is defined in xml.

### Application Startup

- Load cfg file

- Load args (args > cfg file)

- backup old log

- Create new log

- Load UI

### Load UI

- Create UI from configuration (defined by controller using args and cfg file)
