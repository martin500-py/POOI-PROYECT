package BASE_DE_dATOS;

import CLASESCURSO_DETALLECLASE.CURSO;
import CLASESCURSO_DETALLECLASE.MATRICULA;

import CLASES_HUMANO.ALUMNO;
import CLASES_HUMANO.DOCENTE;
//import com.mysql.jdbc.ResultSetRow;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class CLASS_MAIN_CAPTURA {

    ////////////////////////////////////////////////////
    public Connection con;
    public Statement st;
    public PreparedStatement pst;
    ////////////////////////////////////////////////////

    public CLASS_MAIN_CAPTURA() {
        prepararbasededatos();
    }
    
    public void prepararbasededatos() {
        String controlador = "com.mysql.cj.jdbc.Driver";
        String driver = "jdbc:mysql://localhost:3306/poo";
        String user = "root";
        String pass = "";

        try {
            try {
                Class.forName(controlador);
            } catch (ClassNotFoundException ex) {
                // Compatibilidad con versiones anteriores del driver
                Class.forName("com.mysql.jdbc.Driver");
            }
            con = DriverManager.getConnection(driver, user, pass);
            if (con != null) {
                System.out.println("Conexion ok.......... Conectado exitosamente a la base de datos 'poo'");
            }
        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos 'poo': " + e.getMessage());
        }
    }

    public ArrayList<DOCENTE> docentes = new ArrayList<>();
    public ArrayList<ALUMNO> alumnos = new ArrayList<>();
    public ArrayList<CURSO> cursos = new ArrayList<>();
    public ArrayList<MATRICULA> matricula = new ArrayList<>();

//    public ArrayList<BOLETA_DE_NOTA> boletas=new ArrayList<>();
//    
//    
//    
    /////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////
   
    public ArrayList<DOCENTE> getarraydocente() {
        docentes.clear();
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("Select *  from docentes"); //consulta
//            rs.beforeFirst();
            while (rs.next()) {
                DOCENTE docente = new DOCENTE(rs.getString("Codigo"), rs.getString("Contraseña"), rs.getString("Dni"), rs.getString("NombreCompleto"), rs.getString("Telefono"), rs.getString("CorreoInstitucional"));
                docentes.add(docente);
            }
        } catch (Exception e) {
            System.out.println("Error no cargo docente: " + e.getMessage());
        }
        return docentes;
    }

    public void setarraydocente(ArrayList<DOCENTE> docente) {
        String sqlBuscar = "SELECT Codigo FROM docentes WHERE Codigo = ?";
        String sqlInsert = "INSERT INTO docentes (Codigo, NombreCompleto, Dni, CorreoInstitucional, Telefono, Contraseña) VALUES (?, ?, ?, ?, ?, ?)";
        String sqlUpdate = "UPDATE docentes SET NombreCompleto = ?, Dni = ?, CorreoInstitucional = ?, Telefono = ?, Contraseña = ? WHERE Codigo = ?";
        try {
            PreparedStatement pstBuscar = con.prepareStatement(sqlBuscar);
            PreparedStatement pstInsert = con.prepareStatement(sqlInsert);
            PreparedStatement pstUpdate = con.prepareStatement(sqlUpdate);
            for (DOCENTE d : docente) {
                pstBuscar.setString(1, d.getCodigo());
                ResultSet rs = pstBuscar.executeQuery();
                if (rs.next()) {
                    pstUpdate.setString(1, d.getNombre_completo());
                    pstUpdate.setString(2, d.getDni());
                    pstUpdate.setString(3, d.getCorreoinstitucional());
                    pstUpdate.setString(4, d.getTelefono());
                    pstUpdate.setString(5, d.getContraseña());
                    pstUpdate.setString(6, d.getCodigo());
                    pstUpdate.executeUpdate();
                } else {
                    pstInsert.setString(1, d.getCodigo());
                    pstInsert.setString(2, d.getNombre_completo());
                    pstInsert.setString(3, d.getDni());
                    pstInsert.setString(4, d.getCorreoinstitucional());
                    pstInsert.setString(5, d.getTelefono());
                    pstInsert.setString(6, d.getContraseña());
                    pstInsert.executeUpdate();
                }
                rs.close();
            }
            pstBuscar.close();
            pstInsert.close();
            pstUpdate.close();
            System.out.println("Lista de docentes procesada y actualizada completamente.");
            docentes.clear();
            docentes.addAll(docente);
        } catch (Exception e) {
            System.out.println("Error al procesar la lista: " + e.getMessage());
        }
    }

    /////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////
    
    
    public ArrayList<ALUMNO> getarrayalumno() {
        alumnos.clear();
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("Select *from alumnos");
            while (rs.next()) {

                ALUMNO a = new ALUMNO(rs.getString("Direccion"), rs.getInt("Creditos"), rs.getString("Codigo"), rs.getString("Password"), rs.getString("Dni"), rs.getString("NombreCompleto"), rs.getString("Telefono"), rs.getString("CorreoInstitucional"));
                alumnos.add(a);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            System.out.println("Error no se ingreso alumnos");
        }

        return alumnos;
    }

    public void setarrayalumno(ArrayList<ALUMNO> alum) {
        String sqlBuscar = "SELECT Codigo FROM alumnos WHERE Codigo = ?";
        String sqlInsert = "INSERT INTO alumnos (NombreCompleto, Codigo, Dni, CorreoInstitucional, Telefono, Direccion, Creditos, Password) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        String sqlUpdate = "UPDATE alumnos SET NombreCompleto = ?, Dni = ?, CorreoInstitucional = ?, Telefono = ?, Direccion = ?, Creditos = ?, Password = ? WHERE Codigo = ?";

        try {
            PreparedStatement pstBuscar = con.prepareStatement(sqlBuscar);
            PreparedStatement pstInsert = con.prepareStatement(sqlInsert);
            PreparedStatement pstUpdate = con.prepareStatement(sqlUpdate);

            for (ALUMNO a : alum) {

                pstBuscar.setString(1, a.getCodigo());
                ResultSet rs = pstBuscar.executeQuery();

                if (rs.next()) {

                    pstUpdate.setString(1, a.getNombre_completo());
                    pstUpdate.setString(2, a.getDni());
                    pstUpdate.setString(3, a.getCorreoinstitucional());
                    pstUpdate.setString(4, a.getTelefono());
                    pstUpdate.setString(5, a.getDireccion());
                    pstUpdate.setInt(6, a.getCreditos());
                    pstUpdate.setString(7, a.getContraseña());
                    pstUpdate.setString(8, a.getCodigo());

                    pstUpdate.executeUpdate();

                } else {

                    pstInsert.setString(1, a.getNombre_completo());
                    pstInsert.setString(2, a.getCodigo());
                    pstInsert.setString(3, a.getDni());
                    pstInsert.setString(4, a.getCorreoinstitucional());
                    pstInsert.setString(5, a.getTelefono());
                    pstInsert.setString(6, a.getDireccion());
                    pstInsert.setInt(7, a.getCreditos());
                    pstInsert.setString(8, a.getContraseña());

                    pstInsert.executeUpdate();
                }

                rs.close();
            }

            pstBuscar.close();
            pstInsert.close();
            pstUpdate.close();

            if (this.alumnos == null) {
                this.alumnos = new ArrayList<>();
            } else {
                this.alumnos.clear();
            }
            this.alumnos.addAll(alum);

            System.out.println("Lista de ALUMNOS procesada y actualizada exitosamente.");

        } catch (Exception e) {
            System.out.println("Error al procesar alumnos: " + e.getMessage());
        }
    }

    /////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////
 /////////////////////////////////////////////////////////////////////////////

 
 
    
     public ArrayList<CURSO> getarraycurso() {
        cursos.clear();
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("Select c.NombreCurso,d.Codigo,d.NombreCompleto,d.Dni,d.CorreoInstitucional,d.Telefono,"
                    + "d.Contraseña from cursos c inner join docentes d on d.DocenteID=c.DocenteID");

            while (rs.next()) {

                DOCENTE docente = new DOCENTE(rs.getString("Codigo"), rs.getString("Contraseña"), rs.getString("Dni"), rs.getString("NombreCompleto"), rs.getString("Telefono"), rs.getString("CorreoInstitucional"));

                CURSO cu = new CURSO(docente, rs.getString("NombreCurso"));
                cursos.add(cu);
            }

        } catch (Exception e) {

            System.out.println("Error no hay curso: " + e.getMessage());
        }

        return cursos;
    }

    public void setarraycurso(ArrayList<CURSO> listaCursos) {
        String sqlBuscar = "SELECT NombreCurso FROM cursos WHERE NombreCurso = ?";
        String sqlInsert = "INSERT INTO cursos (NombreCurso, DocenteID) VALUES (?, (SELECT DocenteID FROM docentes WHERE Codigo = ?))";
        String sqlUpdate = "UPDATE cursos SET DocenteID = (SELECT DocenteID FROM docentes WHERE Codigo = ?) WHERE NombreCurso = ?";

        try {

            PreparedStatement pstBuscar = con.prepareStatement(sqlBuscar);
            PreparedStatement pstInsert = con.prepareStatement(sqlInsert);
            PreparedStatement pstUpdate = con.prepareStatement(sqlUpdate);

            for (CURSO c : listaCursos) {

                pstBuscar.setString(1, c.getNombrecurso());
                ResultSet rs = pstBuscar.executeQuery();

                if (rs.next()) {

                    pstUpdate.setString(1, c.getDocente().getCodigo());
                    pstUpdate.setString(2, c.getNombrecurso());
                    pstUpdate.executeUpdate();
                } else {

                    pstInsert.setString(1, c.getNombrecurso());
                    pstInsert.setString(2, c.getDocente().getCodigo());
                    pstInsert.executeUpdate();
                }

                rs.close();
            }

            pstBuscar.close();
            pstInsert.close();
            pstUpdate.close();

            this.cursos.clear();

            this.cursos.addAll(listaCursos);

            System.out.println("Lista de cursos sincronizada correctamente con la BD.");

        } catch (Exception e) {
            System.out.println("Error en setarraycurso: " + e.getMessage());
        }
    }

  
  
     public ArrayList<MATRICULA> getarraymatricula() {

        this.matricula.clear();

        String sql = "SELECT "
                + "m.CicloRelativo, m.CreditosCiclo, m.PromedioPracticas, m.ExamenParcial, m.ExamenFinal, m.NotaFinal, m.Estado, "
                + "d.Codigo AS CodigoDocente, d.NombreCompleto AS NombreDocente, d.Dni AS DniDocente, "
                + "d.CorreoInstitucional AS CorreoDocente, d.Telefono AS TelefonoDocente, d.Contraseña AS PassDocente, "
                + "c.NombreCurso, "
                + "a.NombreCompleto AS NombreAlumno, a.Codigo AS CodigoAlumno, a.Dni AS DniAlumno, "
                + "a.CorreoInstitucional AS CorreoAlumno, a.Telefono AS TelefonoAlumno, a.Direccion, a.Creditos, a.Password AS PassAlumno "
                + "FROM matricula m "
                + "INNER JOIN alumnos a ON a.AlumnoID = m.AlumnoID "
                + "INNER JOIN cursos c ON c.CursoID = m.CursoID "
                + "INNER JOIN docentes d ON d.DocenteID = c.DocenteID";

        try {

            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                ALUMNO alumno = new ALUMNO(
                        rs.getString("Direccion"),
                        rs.getInt("Creditos"),
                        rs.getString("CodigoAlumno"),
                        rs.getString("PassAlumno"),
                        rs.getString("DniAlumno"),
                        rs.getString("NombreAlumno"),
                        rs.getString("TelefonoAlumno"),
                        rs.getString("CorreoAlumno")
                );

                DOCENTE docente = new DOCENTE(
                        rs.getString("CodigoDocente"),
                        rs.getString("PassDocente"),
                        rs.getString("DniDocente"),
                        rs.getString("NombreDocente"),
                        rs.getString("TelefonoDocente"),
                        rs.getString("CorreoDocente")
                );

                CURSO curso = new CURSO(docente, rs.getString("NombreCurso"));

                MATRICULA m = new MATRICULA(
                        alumno,
                        curso,
                        rs.getString("CicloRelativo"),
                        rs.getInt("CreditosCiclo"),
                        rs.getDouble("PromedioPracticas"),
                        rs.getDouble("ExamenParcial"),
                        rs.getDouble("ExamenFinal"),
                        rs.getDouble("NotaFinal"),
                        rs.getString("Estado")
                );

                matricula.add(m);
            }

            rs.close();
            st.close();

        } catch (Exception e) {
            System.out.println("Error al obtener la lista de matriculas: " + e.getMessage());
        }

        return matricula;
    }

    public void setarraymatricula(ArrayList<MATRICULA> matri) {

        String sqlbuscar = "SELECT m.MatriculaID FROM matricula m "
                + "INNER JOIN alumnos a ON a.AlumnoID = m.AlumnoID "
                + "INNER JOIN cursos c ON c.CursoID = m.CursoID "
                + "WHERE a.Codigo = ? AND c.NombreCurso = ?";
        String sqlinser = "insert into matricula(AlumnoId,CursoId,CicloRelativo,CreditosCiclo,"
                + "PromedioPracticas,ExamenParcial,ExamenFinal,NotaFinal,Estado) values"
                + "((select AlumnoId from alumnos where Codigo=?),(select CursoId from cursos where NombreCurso=?),?,?,?,?,?,?,?)";
        String sqlupdate = "UPDATE matricula SET "
                + "CicloRelativo = ?, CreditosCiclo = ?, PromedioPracticas = ?, ExamenParcial = ?, ExamenFinal = ?, NotaFinal = ?, Estado = ? "
                + "WHERE AlumnoID = (SELECT AlumnoID FROM alumnos WHERE Codigo = ?) "
                + "AND CursoID = (SELECT CursoID FROM cursos WHERE NombreCurso = ?)";
        try {
            PreparedStatement pstbuscar = con.prepareStatement(sqlbuscar);
            PreparedStatement pstinsertar = con.prepareStatement(sqlinser);
            PreparedStatement pstupdate = con.prepareStatement(sqlupdate);

            for (MATRICULA m : matri) {

                pstbuscar.setString(1, m.getAlumno().getCodigo());
                pstbuscar.setString(2, m.getCurso().getNombrecurso());
                ResultSet rs = pstbuscar.executeQuery();

                if (rs.next()) {

                    pstupdate.setString(1, m.getCiclorelativo());
                    pstupdate.setInt(2, m.getCreditos());
                    pstupdate.setDouble(3, m.getPp());
                    pstupdate.setDouble(4, m.getEp());
                    pstupdate.setDouble(5, m.getEf());
                    pstupdate.setDouble(6, m.getNotafinal());
                    pstupdate.setString(7, m.getEstado());

                    pstupdate.setString(8, m.getAlumno().getCodigo());
                    pstupdate.setString(9, m.getCurso().getNombrecurso());

                    pstupdate.executeUpdate();

                } else {
                    pstinsertar.setString(1, m.getAlumno().getCodigo());
                    pstinsertar.setString(2, m.getCurso().getNombrecurso());

                    pstinsertar.setString(3, m.getCiclorelativo());
                    pstinsertar.setInt(4, m.getCreditos());
                    pstinsertar.setDouble(5, m.getPp());
                    pstinsertar.setDouble(6, m.getEp());
                    pstinsertar.setDouble(7, m.getEf());
                    pstinsertar.setDouble(8, m.getNotafinal());
                    pstinsertar.setString(9, m.getEstado());

                    pstinsertar.executeUpdate();
                }

                rs.close();
            }

            pstbuscar.close();
            pstinsertar.close();
            pstupdate.close();

        } catch (Exception e) {
            System.out.println("Error no cargo arraymatricula");
        }
    }

    /////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////
   
     
     public static void main(String[] args) {
        CLASS_MAIN_CAPTURA prueba = new CLASS_MAIN_CAPTURA();
        prueba.prepararbasededatos();
    }
}
