# Window classification

| Class            | Super                                          | Features                                             | Availability              |
|------------------|------------------------------------------------|------------------------------------------------------|---------------------------|
| SimpleWindow     | `AbstractWindow`                               | Only contents                                        | Available                 |
| SinglePageWindow | `AbstractLayeredWindow extends AbstractWindow` | * Contents - contains a single page <br> * Overlays  | *Currently not available* |
| MultiPageWindow  | `AbstractLayeredWindow extends AbstractWindow` | * Contents - contains multiple pages <br> * Overlays | *Currently not available* |