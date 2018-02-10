package Questao2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Data implements Cloneable {

    private Date data;
    private DateFormat f = DateFormat.getDateInstance();

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Data(String data) {
        try {
            this.data = f.parse(data);
        } catch (Exception e) {
            this.data = new Date();
        }
    }

    public Integer compara(Data data) {
        int result = this.data.compareTo(data.getData());

        if (result == 0) {
            return 0;
        } else if (result > 0){
            return 1;
        } else if (result < 0){
            return -1;
        }
        return null;
//    0 se as datas forem iguais
//    1 se a data corrente for maior a do parametro
//    -1 se a data do parametro for maior que a corrente
    }

    public boolean isBissexto() {
        boolean isBissexto = false;

        if (this.data.getYear() % 4 != 0) {
            isBissexto = false;
        } else if (this.data.getYear() % 100 != 0) {
            isBissexto = true;
        } else if (this.data.getYear() % 400 != 0) {
            isBissexto = false;
        } else {
            isBissexto = true;
        }

        return isBissexto;
    }

    public String getDia() {
        DateFormat df2 = new SimpleDateFormat("dd", new Locale("pt", "BR"));
        return df2.format(this.data);
    }

    public String getMes() {
        DateFormat df2 = new SimpleDateFormat("MM", new Locale("pt", "BR"));
        return df2.format(this.data);
    }

    public String getAno() {
        DateFormat df2 = new SimpleDateFormat("YYYY", new Locale("pt", "BR"));
        return df2.format(this.data);
    }

    public String getMesExtenso() {
        DateFormat df2 = new SimpleDateFormat("MMMMM", new Locale("pt", "BR"));
        return df2.format(this.data);
    }

    @Override
    public Data clone(){
        try {
            return (Data) super.clone();
        } catch (CloneNotSupportedException c) {
            System.out.println("Erro ao clonar: " + c);
        }
        return null;
    }

    public static void main(String[] args) {
        Data d = new Data("05/03/2017");
        System.out.println("Dia: " + d.getDia());
        System.out.println("Mês: " + d.getMes());
        System.out.println("Ano: " + d.getAno());
        System.out.println("Mês extenso: " + d.getMesExtenso());
        System.out.println("Ano bissexto: " + d.isBissexto());
        System.out.println("Compara: " + d.compara(new Data("04/03/2017")));
        Data d2 = d.clone();
        System.out.println(d2.getMesExtenso());
    }
}
