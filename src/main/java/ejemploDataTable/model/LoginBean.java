package ejemploDataTable.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class LoginBean {
	private String username;
    private String password;
    
    
    public String login() {
        // Lógica de autenticación
        if ("usuario".equals(username) && "123".equals(password)) {
            return "bienvenido"; // Debe coincidir con <from-outcome> en faces-config.xml
        } else {
            FacesContext.getCurrentInstance().addMessage(null, 
                new javax.faces.application.FacesMessage(
                    javax.faces.application.FacesMessage.SEVERITY_ERROR, 
                    "Error de inicio de sesión", 
                    "Verifica tus credenciales."
                )
            );
            return "error"; // Debe coincidir con <from-outcome> en faces-config.xml
        }
    }
    
    
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
