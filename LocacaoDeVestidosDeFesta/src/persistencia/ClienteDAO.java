package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

public class ClienteDAO {

    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    // LÊ TODOS
    public static List<Cliente> leTodos() throws Exception {

        List<Cliente> listClientes = new ArrayList<Cliente>();

        try {
            String sql = "SELECT * FROM cliente";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();

                c.setId(rs.getInt("id_cliente"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setTelefone(rs.getString("telefone"));
                c.setEmail(rs.getString("email"));
                c.setEndereco(rs.getString("endereco"));

                listClientes.add(c);
            }

            st.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listClientes;
    }

    // LIKE
    public static List<Cliente> leTodosLike(String nome) throws Exception {

        List<Cliente> listClientes = new ArrayList<Cliente>();

        try {
            String sql = "SELECT * FROM cliente WHERE nome LIKE ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, "%" + nome + "%");

            rs = st.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();

                c.setId(rs.getInt("id_cliente"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setTelefone(rs.getString("telefone"));
                c.setEmail(rs.getString("email"));
                c.setEndereco(rs.getString("endereco"));

                listClientes.add(c);
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return listClientes;
    }

    // NOT IN
    public static List<Cliente> leTodosNotIn(int id1, int id2) throws Exception {

        List<Cliente> listClientes = new ArrayList<Cliente>();

        try {
            String sql = "SELECT * FROM cliente WHERE id_cliente NOT IN (?, ?)";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id1);
            st.setInt(2, id2);

            rs = st.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();

                c.setId(rs.getInt("id_cliente"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setTelefone(rs.getString("telefone"));
                c.setEmail(rs.getString("email"));
                c.setEndereco(rs.getString("endereco"));

                listClientes.add(c);
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return listClientes;
    }

    // BETWEEN
    public static List<Cliente> leTodosBetween(int idInicial, int idFinal) throws Exception {

        List<Cliente> listClientes = new ArrayList<Cliente>();

        try {
            String sql = "SELECT * FROM cliente WHERE id_cliente BETWEEN ? AND ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idInicial);
            st.setInt(2, idFinal);

            rs = st.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();

                c.setId(rs.getInt("id_cliente"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setTelefone(rs.getString("telefone"));
                c.setEmail(rs.getString("email"));
                c.setEndereco(rs.getString("endereco"));

                listClientes.add(c);
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return listClientes;
    }

    // LÊ UM
    public static Cliente leUm(int id) throws Exception {

        Cliente cliente = new Cliente();

        try {
            String sql = "SELECT * FROM cliente WHERE id_cliente = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, id);

            rs = st.executeQuery();

            if (rs.next()) {
                cliente.setId(rs.getInt("id_cliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEmail(rs.getString("email"));
                cliente.setEndereco(rs.getString("endereco"));
            }

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return cliente;
    }

    // GRAVA
    public static int grava(String nome, String cpf, String telefone, String email, String endereco) throws Exception {

        int ret = 0;

        try {
            String sql = "INSERT INTO cliente (nome, cpf, telefone, email, endereco) VALUES (?, ?, ?, ?, ?)";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, nome);
            st.setString(2, cpf);
            st.setString(3, telefone);
            st.setString(4, email);
            st.setString(5, endereco);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }

    // ALTERA
    public static int altera(String nome, String cpf, String telefone, String email, String endereco, int id) throws Exception {

        int ret = 0;

        try {
            String sql = "UPDATE cliente SET nome = ?, cpf = ?, telefone = ?, email = ?, endereco = ? WHERE id_cliente = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, nome);
            st.setString(2, cpf);
            st.setString(3, telefone);
            st.setString(4, email);
            st.setString(5, endereco);
            st.setInt(6, id);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }

    // UPDATE COM LIKE E >
    public static int alteraEmailComLikeEMaior(String novoEmail, String nome, int id) throws Exception {

        int ret = 0;

        try {
            String sql = "UPDATE cliente SET email = ? WHERE nome LIKE ? AND id_cliente > ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);

            st.setString(1, novoEmail);
            st.setString(2, "%" + nome + "%");
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
            String sql = "DELETE FROM cliente WHERE id_cliente = ?";

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