	package deneme1;


	import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.JButton;

	public class grafikGui  {
	
	JFrame frame = new JFrame();
	@SuppressWarnings("rawtypes")
	JComboBox comboBox = new JComboBox();
	ChartPanel cp;
	ChartPanel cp1;
		
	 
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public grafikGui() {
		 
		 	frame = new JFrame("grafik2");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(806, 578);
			frame.getContentPane().setLayout(null);
			
			comboBox.setToolTipText("");
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select...", "Pie Chart", "Bar Chart"}));
			comboBox.setSelectedIndex(0);
			comboBox.setBounds(81, 40, 138, 34);
			frame.getContentPane().add(comboBox);
			
			JButton btn = new JButton("OPEN");
			btn.setBounds(324, 46, 102, 28);
			frame.getContentPane().add(btn);
			
			
			// create a dataset...
	        DefaultPieDataset data = new DefaultPieDataset();
	        data.setValue("Category 1", 43.2);
	        data.setValue("Category 2", 27.9);
	        data.setValue("Category 3", 79.5);
	        data.setValue("category 4",14.6);

			//create a dataset for bar chart
			//create a dataset for pie chart
			//create a dataset for line chart
			//create a dataset for scatter plot
			//create a dataset for bubble chart
			//create a dataset for radar chart
			//create a dataset for candlestick chart
			//create a dataset for heat map
			//create a dataset for treemap
			//create a dataset for scatter plot
			//create a dataset for bubble chart
			//create a dataset for radar chart
			//create a dataset for candlestick chart
			//create a dataset for heat map
			//create a dataset for treemap
			
	        
	        
	        // create a chart...
	        JFreeChart chart = ChartFactory.createPieChart(
	            "Sample Pie Chart",
	            data,
	            true, // legend?
	            true, // tooltips?
	            false // URLs?
	        );
	        
	        
	        DefaultCategoryDataset data1= new DefaultCategoryDataset();  
	        // Population in 2005  
	        data1.addValue(10, "USA", "2005");  
	        data1.addValue(15, "India", "2005");  
	        data1.addValue(20, "China", "2005");  
	      
	        // Population in 2010  
	        data1.addValue(15, "USA", "2010");  
	        data1.addValue(20, "India", "2010");  
	        data1.addValue(25, "China", "2010");  
	      
	        // Population in 2015  
	        data1.addValue(20, "USA", "2015");  
	        data1.addValue(25, "India", "2015");  
	        data1.addValue(30, "China", "2015");  
	        
	      //Create chart  
	        JFreeChart chart1=ChartFactory.createBarChart(  
	            "Bar Chart Example", //Chart Title  
	            "Year", // Category axis  
	            "Population in Million", // Value axis  
	            data1,  
	            PlotOrientation.VERTICAL,  
	            true,true,false  
	           );  
	        	cp =  new ChartPanel(chart);
	        	cp.setBounds(110, 140, 550, 355);
	        	
	        	cp1 = new ChartPanel(chart1);
	        	cp1.setBounds(110, 140, 550, 355);
	        
			
			btn.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					
					 String x = (String) comboBox.getSelectedItem();
					
					if(x=="Pie Chart") {
						frame.getContentPane().add(cp);
						frame.revalidate();
						frame.repaint();
						
					}
						
					else if(x=="Bar Chart") {
						frame.getContentPane().add(cp1);
						frame.revalidate();
						frame.repaint();
						
			       		
		           		
					}	
					
				}
				
			});
			
			frame.setVisible(true);
		 
	 }
	public static void main(String[] args) {
		
		new grafikGui();
			
	
	}
	
	}
