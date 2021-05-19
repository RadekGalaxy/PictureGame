

public enum ItemType {
	Zbran{
		@Override
        public String printItemType() {
            return "Zbran";
        }
	}
	,
	Stit{
		@Override
        public String printItemType() {
            return "Stit";
        }
	}
	,
	Brnko{
		@Override
        public String printItemType() {
            return "Brneni";
        }
	}
	,
	Amulet{
		@Override
        public String printItemType() {
            return "Amulet";
        }
	};

	public abstract String printItemType();
}



 
