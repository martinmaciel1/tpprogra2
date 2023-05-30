package servicio;
import java.util.Date;

import persona.Cliente;
import persona.Especialista;
public abstract class RegistroServicio {

        private Cliente cliente;
        private Especialista especialista;
        private Date horaInicio;
        private Date horaFinal;
        private String domicilio;
        private double importeTotal;

        public RegistroServicio(Cliente cliente, Especialista especialista, String domicilio) {
            this.cliente = cliente;
            this.especialista = especialista;
            this.domicilio = domicilio;
        }

        public Cliente consultarCliente() {
            return cliente;
        }

        public Especialista consultarEspecialista() {
            return especialista;
        }

        public Date consultarHoraInicio() {
            return horaInicio;
        }

        public Date consultarHoraFinal() {
            return horaFinal;
        }

        public String consultarDomicilio() {
            return domicilio;
        }

        public double consultarImporteTotal() {
            return importeTotal;
        }

    }
