package com.solvd.photostudio.enums;


public enum Style {
    CASUAL {
        public String getValue() {
            return "casual";
        }
    },
    LIGHT {
        public String getValue() {
            return "light";
        }
    },
    GLAMOUR {
        public String getValue() {
            return "glamour";
        }
    },
    CORPORATE {
        public String getValue() {
            return "corporate";
        }
    },
    FOREST {
        public String getValue() {
            return "forest";
        }
    },
    WEDDING {
        public String getValue() {
            return "wedding";
        }
    },
    FASHION {
        public String getValue() {
            return "fashion";
        }
    }, BIRTHDAY {
        public String getValue() {
            return "birthday";
        }
    };

    public abstract String getValue();
}


