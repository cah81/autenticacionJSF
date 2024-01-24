package ejemploDataTable.model;

import java.io.File;
import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

@ManagedBean
@SessionScoped
public class GraficasChartBean {
	XYSeries series = new XYSeries("Producto A");
	XYSeriesCollection dataset = new XYSeriesCollection();
	private JFreeChart chart;
	
	

	@PostConstruct
	public void init() {
		// Introduccion de datos
	    series.add(1, 1);
	    series.add(2, 6);
	    series.add(3, 3);
	    series.add(4, 10);
	    dataset.addSeries(series);
	    
	    chart = ChartFactory.createXYLineChart(
	            "Ventas 2014", // Título
	            "Tiempo (x)", // Etiqueta Coordenada X
	            "Cantidad", // Etiqueta Coordenada Y
	            dataset, // Datos
	            PlotOrientation.VERTICAL,
	            true, // Muestra la leyenda de los productos (Producto A)
	            false,
	            false
	    );
	}
	
	public void mostrarGrafico() {
        // Definir la ruta completa donde guardar la imagen
        String rutaImagen = "D:\\desarrollos\\workspace-java\\ejemploDataTable\\src\\main\\resources\\grafico.png";

        // Crear el directorio si no existe
        File directorio = new File(rutaImagen).getParentFile();
        if (!directorio.exists()) {
            directorio.mkdirs();
        }

        // Guardar el gráfico como una imagen
        try {
            ChartUtilities.saveChartAsPNG(new File(rutaImagen), chart, 800, 600);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	


           
            
            
            public JFreeChart getChart() {
        		return chart;
        	}

        	public void setChart(JFreeChart chart) {
        		this.chart = chart;
        	}  

}
	 

