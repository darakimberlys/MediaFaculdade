import javax.swing.*;


public class calculaMedia {

    public static void main(String[] args) {
        float mediaImposta, primeiraNota, segundaNota, mediaObtida, pontosFaltantes;
        String materia;
        //Aqui o programa pergunta ao usuário qual o nome da matéria que ele está consultando a nota
        materia = (JOptionPane.showInputDialog(null, "Qual eh o nome da materia que voce esta consultando?", "Notas", JOptionPane.QUESTION_MESSAGE));

        //Aqui o programa pergunta ao usuário qual a nota de média da faculdade, no caso para passar direto sem complicações
        mediaImposta = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual eh a media da universidade?", "Notas", JOptionPane.QUESTION_MESSAGE));

        //Aqui o programa pergunta ao usuário qual a nota da primeira prova bimestral desta materia ele tirou
        primeiraNota = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a primeira nota de " + materia + ": ", "Notas", JOptionPane.QUESTION_MESSAGE));

        //Aqui o programa pergunta ao usuário qual a nota da segunda prova bimestral desta materia ele tirou
        segundaNota = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a segunda nota de " + materia + ": ", "Notas", JOptionPane.QUESTION_MESSAGE));

        //Aqui o programa calcula a media
        mediaObtida = (primeiraNota + segundaNota) / 2;

        //Aqui o programa exibe o resultado, positivo ou negativo já informando quanto o usuário precisará para passar
        if (mediaObtida >= mediaImposta) {
            JOptionPane.showMessageDialog(null, "Sua media foi " + mediaObtida + "\nEntao voce passou em " + materia + "! \nParabens!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            pontosFaltantes = (mediaImposta - mediaObtida) * 2;
            JOptionPane.showMessageDialog(null, "Voce precisa tirar " + pontosFaltantes + " para passar em " + materia + "!", "Resultado", JOptionPane.WARNING_MESSAGE);
        }
    }
}