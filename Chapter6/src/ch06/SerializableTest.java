package ch06;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Externalizable{
	

	private static final long serialVersionUID = 1L;
	
	String name;
	String job;
	
	
	public Person() {}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString()
	{
		return name + "," + job;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		//out.writeUTF(job);
		out.writeUTF(name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		//job = in.readUTF();
		name = in.readUTF();
	}
}




public class SerializableTest {

	public static void main(String[] args) {

		Person personKim = new Person("Kim", "Manager");
		Person personLee = new Person("Lee", "Leader");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos))
		{
			oos.writeObject(personKim);
			oos.writeObject(personLee);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis))
		{
			
			Person ps1 = (Person)ois.readObject();
			Person ps2 = (Person)ois.readObject();
			
			System.out.println(ps1);
			System.out.println(ps2);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
