@Entity
@Table(name="AkurdiStudents")
public class Student 
{
   public Student()
   {
	   
   }
   public int getRollno()
   {
	   return rollno;
   }
   public void setRollno(int rollno)
   {
	   this.rollno=rollno;
   }
}
