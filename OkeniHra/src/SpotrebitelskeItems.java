

public enum SpotrebitelskeItems {
	Maso{
		@Override
        public String printSpotrebitelItem() {
            return "Maso";
        }
	},Pecivo{
		@Override
        public String printSpotrebitelItem() {
            return "Pecivo";
        }
	},Leky{
		@Override
        public String printSpotrebitelItem() {
            return "Leky";
        }
	}, Lektvar{
		@Override
        public String printSpotrebitelItem() {
            return "Lektvar";
        }
	};
	
	public abstract String printSpotrebitelItem();
}
