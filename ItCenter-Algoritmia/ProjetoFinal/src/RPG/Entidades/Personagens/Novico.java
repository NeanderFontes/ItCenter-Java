package RPG.Entidades.Personagens;

import RPG.Entidades.Heroi;
import RPG.Entidades.NPC;
import RPG.Enum.ArmaPrincipal;
import RPG.Enum.ClassePersonagem;

public class Novico extends Heroi {
    private ClassePersonagem classePersonagem;

    /**
     * Método Construtor Noviço da Abstract SuperClass <b>Heroi</b>
     *
     * @param nomeEntidade       - Nome do Noviço
     * @param vidaEntidade       - Total de Vida do Noviço
     * @param forcaEntidade      - Total de Força de Ataque do Noviço
     * @param nivelHeroi         - Nivel do Noviço
     * @param ouroHeroi          - Quantidade de ouro do Noviço
     * @param armaPrincipalHeroi - Tipo de Arma do Noviço
     * @param classePersonagem   - Tipo da Classe do Noviço
     */
    public Novico(String nomeEntidade, int vidaEntidade, int forcaEntidade, int nivelHeroi, int ouroHeroi, ArmaPrincipal armaPrincipalHeroi, ClassePersonagem classePersonagem) {
        super(nomeEntidade, vidaEntidade, forcaEntidade, nivelHeroi, ouroHeroi, armaPrincipalHeroi);
        this.classePersonagem = ClassePersonagem.NOVICO;
    }

    /**
     * Método @Override Adaptado ao Noviço para Atacar um NPC
     *
     * @param oponenteNPC - Recebe como Parâmetro o Npc para Batalha
     */
    @Override
    public void atacar(NPC oponenteNPC) {

    }

    /**
     * Método Getter e Setter do Noviço
     */
    public ClassePersonagem getClassePersonagem() {
        return classePersonagem;
    }

    public void setClassePersonagem(ClassePersonagem classePersonagem) {
        this.classePersonagem = classePersonagem;
    }
}
