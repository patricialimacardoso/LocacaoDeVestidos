package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Funcionario;

public class FuncionarioDAO {

    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    // LÊ TODOS
    public static List<Funcionario> leTodos() throws Exception {
        List<Funcionario> lista = new ArrayList<Funcionario>();

        try {
            String sql = "SELECT * FROM funcionario";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Funcionario f = new Funcionario();
                f.setId(rs.getInt("id_funcionario"));
                f.setNome(rs.getString("nome"));
                f.setCpf(rs.getString("cpf"));
                f.setTelefone(rs.getString("telefone"));
                f.setEmail(rs.getString("email"));
                f.setCargo(rs.getString("cargo"));
                f.setSalario(rs.getDouble("salario"));
                lista.add(f);
            }

            st.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    // LIKE
    public static List<Funcionario> leTodosLike(String cargo) throws Exception {
        List<Funcionario> lista = new ArrayList<Funcionario>();

        try {
            String sql = "SELECT * FROM funcionario WHERE cargo LIKE ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, "%" + cargo + "%");
            rs = st.executeQuery();

            while (rs.next()) {
                Funcionario f = new Funcionario();
                f.setId(rs.getInt("id_funcionario"));
                f.setNome(rs.getString("nome"));
                f.setCpf(rs.getString("cpf"));
                f.setTelefone(rs.getString("telefone"));
                f.setEmail(rs.getString("email"));
                f.setCargo(rs.getString("cargo"));
                f.setSalario(rs.getDouble("salario"));
                lista.add(f);
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    // NOT IN
    public static List<Funcionario> leTodosNotIn(int id1, int id2) throws Exception {
        List<Funcionario> lista = new ArrayList<Funcionario>();

        try {
            String sql = "SELECT * FROM funcionario WHERE id_funcionario NOT IN (?, ?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id1);
            st.setInt(2, id2);
            rs = st.executeQuery();

            while (rs.next()) {
                Funcionario f = new Funcionario();
                f.setId(rs.getInt("id_funcionario"));
                f.setNome(rs.getString("nome"));
                f.setCpf(rs.getString("cpf"));
                f.setTelefone(rs.getString("telefone"));
                f.setEmail(rs.getString("email"));
                f.setCargo(rs.getString("cargo"));
                f.setSalario(rs.getDouble("salario"));
                lista.add(f);
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    // BETWEEN
    public static List<Funcionario> leTodosBetween(double salarioInicial, double salarioFinal) throws Exception {
        List<Funcionario> lista = new ArrayList<Funcionario>();

        try {
            String sql = "SELECT * FROM funcionario WHERE salario BETWEEN ? AND ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setDouble(1, salarioInicial);
            st.setDouble(2, salarioFinal);
            rs = st.executeQuery();

            while (rs.next()) {
                Funcionario f = new Funcionario();
                f.setId(rs.getInt("id_funcionario"));
                f.setNome(rs.getString("nome"));
                f.setCpf(rs.getString("cpf"));
                f.setTelefone(rs.getString("telefone"));
                f.setEmail(rs.getString("email"));
                f.setCargo(rs.getString("cargo"));
                f.setSalario(rs.getDouble("salario"));
                lista.add(f);
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    // LÊ UM
    public static Funcionario leUm(int id) throws Exception {
        Funcionario f = new Funcionario();

        try {
            String sql = "SELECT * FROM funcionario WHERE id_funcionario = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                f.setId(rs.getInt("id_funcionario"));
                f.setNome(rs.getString("nome"));
                f.setCpf(rs.getString("cpf"));
                f.setTelefone(rs.getString("telefone"));
                f.setEmail(rs.getString("email"));
                f.setCargo(rs.getString("cargo"));
                f.setSalario(rs.getDouble("salario"));
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return f;
    }

    // GRAVA
    public static int grava(String nome, String cpf, String telefone, String email, String cargo, double salario) throws Exception {
        int ret = 0;

        try {
            String sql = "INSERT INTO funcionario (nome, cpf, telefone, email, cargo, salario) VALUES (?, ?, ?, ?, ?, ?)";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, nome);
            st.setString(2, cpf);
            st.setString(3, telefone);
            st.setString(4, email);
            st.setString(5, cargo);
            st.setDouble(6, salario);

            ret = st.executeUpdate();
            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }

    // ALTERA
    public static int altera(String nome, String cpf, String telefone, String email, String cargo, double salario, int id) throws Exception {
        int ret = 0;

        try {
            String sql = "UPDATE funcionario SET nome = ?, cpf = ?, telefone = ?, email = ?, cargo = ?, salario = ? WHERE id_funcionario = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, nome);
            st.setString(2, cpf);
            st.setString(3, telefone);
            st.setString(4, email);
            st.setString(5, cargo);
            st.setDouble(6, salario);
            st.setInt(7, id);

            ret = st.executeUpdate();
            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }

    // UPDATE COM LIKE E >
    public static int alteraSalarioComLikeEMaior(double novoSalario, String cargo, int id) throws Exception {
        int ret = 0;

        try {
            String sql = "UPDATE funcionario SET salario = ? WHERE cargo LIKE ? AND id_funcionario > ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setDouble(1, novoSalario);
            st.setString(2, "%" + cargo + "%");
            st.setInt(3, id);

            ret = st.executeUpdate();
            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }

    // EXCLUI
    public static int exclui(int id) throws Exception {
        int ret = 0;

        try {
            String sql = "DELETE FROM funcionario WHERE id_funcionario = ?";
            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id);

            ret = st.executeUpdate();
            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }
}