package markerInterface;

public class ShapeDao {
	
	public boolean delete(Object object) {
		if(!(object instanceof Deletable)) {
			return false;
		}
		
		//delete implements details
		System.out.println("marker interface implements");
			return true;
	}

}
