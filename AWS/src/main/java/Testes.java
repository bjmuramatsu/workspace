import junit.framework.JUnit4TestAdapter;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



@RunWith(Suite.class)
@SuiteClasses({
PermissoesAgentesSuite.class,
PermissoesSupervisoresSuite.class,
PermissoesAdministradoresSuite.class
})

public class Testes {
	 public static JUnit4TestAdapter suite() {
	        return new JUnit4TestAdapter(Testes.class);
	    }
	
}
