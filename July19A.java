package July;

public class July19A {

	public static void main(String[] args) {
		Building bd = new Building("North", "One Bed");
		Building.Apartment ba = bd.new Apartment();	
		ba.RoomSize();
		System.out.println("*****************\n\n");
		Building bd1 = new Building("South", "Two Bed");
		Building.Apartment ba1 = bd1.new Apartment();
		ba1.RoomSize();

	}

}


class Building { //Car
	String BulidingName;
	String Type;

	public Building(String nm, String ty) {
		this.BulidingName = nm;
		this.Type = ty;
	}

	public void DisplayBuilding() {
		System.out.println("Watson park Building".concat(this.BulidingName));
	}


	class Apartment {
		String rooms;

	

		public void RoomSize() {

			if (Building.this.Type.equals("One Bed")) {
				this.rooms = "smaller";
				System.out.println(this.rooms);
			} else if (Building.this.Type.equals("Two Bed")) {
				this.rooms = "bigger";
				System.out.println(this.rooms);
			} else {
				this.rooms ="Stdio";
				System.out.println(this.rooms);
			}
				
		}
	}

}