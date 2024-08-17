public class App {
    public static void main(String[] args) throws Exception {
        double[] i1 = {10000, 20000, 15000, 5000, 7000}; //57000
        Ciudad c1 = new Ciudad("Tandil", 150000, 58000, i1);
        double[] i2 = {8000, 12000, 10000, 3000, 5000}; //38000
        Ciudad c2 = new Ciudad("Rauch", 15000, 45000, i2);
        double[] i3 = {5000, 7000, 8000, 2000, 3000}; //25000
        Ciudad c3 = new Ciudad("Azul", 65000, 40000, i3);
        double[] i4 = {5000, 17000, 8000, 2000, 3000}; //35000
        Ciudad c4 = new Ciudad("Olavarria", 105000, 30000, i4);
        double[] i5 = {500, 700, 800, 200, 300}; //2500
        Ciudad c5 = new Ciudad("General Guido", 1200, 2000, i5);

        double[] i6 = {500, 700, 800, 200, 300}; //2500
        Ciudad c6 = new Ciudad("Chilecito", 34000, 200000, i6);
        double[] i7 = {200, 300, 500, 1000, 700}; //2700
        Ciudad c7 = new Ciudad("Arauco", 35000, 400000, i7);
        double[] i8 = {1000, 2000, 1500, 600, 700}; //5800
        Ciudad c8 = new Ciudad("Famatina", 7000, 30000, i8);

        double[] i9 = {50000, 70000, 80000, 20000, 30000}; //250000
        Ciudad c9 = new Ciudad("Cordoba", 3850000, 240000, i9);

        Provincia p1 = new Provincia("Buenos Aires");
        p1.addCiudad(c1);
        p1.addCiudad(c2);
        p1.addCiudad(c3);
        p1.addCiudad(c4);
        p1.addCiudad(c5);
        Provincia p2 = new Provincia("La Rioja");
        p2.addCiudad(c6);
        p2.addCiudad(c7);
        p2.addCiudad(c8);
        Provincia p3 = new Provincia("Cordoba");
        p3.addCiudad(c9);

        Pais ARGENTINA = new Pais("Argentina");

        ARGENTINA.addProvincia(p1);
        ARGENTINA.addProvincia(p2);
        ARGENTINA.addProvincia(p3);

        int limitePoblacion = 25000;
        System.out.println(ARGENTINA.toString());

        System.out.println("CIUDADES DEFICITARIAS CON POBLACION MAYOR A " + limitePoblacion);
        for(Ciudad c: ARGENTINA.ciudadesDeficitMaxPoblacion(limitePoblacion))
            System.out.println(c);

        System.out.println("PROVINCIAS CON MAS DE LA MITAD DE CIUDADES DEFICITARIAS");
        for(Provincia p: ARGENTINA.provinciasDeficitarias())
            System.out.println(p);
    }
}
