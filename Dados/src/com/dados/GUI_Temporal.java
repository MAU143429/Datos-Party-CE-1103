
    public GUI_Temporal() {
    public static void main(String[] args) {
        new GUI_Temporal();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("TIRAR DADOS!")) {
            new Dados();

        }
    }

    }
