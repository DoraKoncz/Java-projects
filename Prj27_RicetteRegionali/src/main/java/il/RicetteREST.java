package il;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Ricetta;
import service.RicetteService;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.json.JSONObject;

@WebServlet("/api/ricette")
public class RicetteREST extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RicetteService service = new RicetteService();

    public RicetteREST() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		
		if ( request.getParameter("ingrediente")!=null) {
			String ingr = request.getParameter("ingredienti");
			List<Ricetta> ricetteFiltrate = service.getAll()
					.stream()
					.filter(r -> r.getNome().contains(ingr))
					.collect(Collectors.toList());
			
			for (Ricetta r : ricetteFiltrate) {
				JSONObject odj  = new JSONObject();
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
