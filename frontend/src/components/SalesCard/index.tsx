import NotificationButton from '../NotificationButton'
import './styles.css'

function SalesCard() {
    return (
        <div className="dsmeta-card">

            <h2 className="dsmeta-sales-title">Vendas</h2>
            <div>
                <div className="dsmeta-form-control-container">
                    <input className="dsmeta-form-control" type="text" />
                </div>
                <div className="dsmeta-form-control-container">
                    <input className="dsmeta-form-control" type="text" />
                </div>
            </div>

            <div>
                <table className="dsmeta-sales-table">
                    <thead>
                        <tr>
                            <th className="show992">ID</th>
                            <th className="show576">Data</th>
                            <th>Vendedor</th>
                            <th className="show992">Visitas</th>
                            <th className="show992">Vendas</th>
                            <th>Total</th>
                            <th>Notificar</th>
                        </tr>
                    </thead>

                    <tbody>
                        <tr>
                            <th className="show992">#001</th>
                            <th className="show576">12/10/2022</th>
                            <th>Marcelo</th>
                            <th className="show992">25</th>
                            <th className="show992">15</th>
                            <th>R$ 52.000,00</th>
                            <th>
                                <div className="dsmeta-red-btn-container">
                                    <NotificationButton />
                                </div>
                            </th>
                        </tr>
                        <tr>
                            <th className="show992">#002</th>
                            <th className="show576">12/10/2022</th>
                            <th>Mauro</th>
                            <th className="show992">80</th>
                            <th className="show992">38</th>
                            <th>R$ 89.000,00</th>
                            <th>
                                <div className="dsmeta-red-btn-container">
                                    <NotificationButton />
                                </div>

                            </th>
                        </tr>
                        <tr>
                            <th className="show992">#003</th>
                            <th className="show576">12/10/2022</th>
                            <th>Eliene</th>
                            <th className="show992">72</th>
                            <th className="show992">50</th>
                            <th>R$ 78.000,00</th>
                            <th>
                                <div className="dsmeta-red-btn-container">
                                    <NotificationButton />
                                </div>

                            </th>
                        </tr>
                        <tr>
                            <th className="show992">#004</th>
                            <th className="show576">12/10/2022</th>
                            <th>Luiza</th>
                            <th className="show992">110</th>
                            <th className="show992">95</th>
                            <th>R$ 150.000,00</th>
                            <th>
                                <div className="dsmeta-red-btn-container">
                                    <NotificationButton />
                                </div>
                            </th>
                        </tr>
                        <tr>
                            <th className="show992">#005</th>
                            <th className="show576">12/10/2022</th>
                            <th>José</th>
                            <th className="show992">65</th>
                            <th className="show992">47</th>
                            <th>R$ 63.000,00</th>
                            <th>
                                <div className="dsmeta-red-btn-container">
                                    <NotificationButton />
                                </div>
                            </th>
                        </tr>
                    </tbody>
                </table>
            </div>

        </div>

    )
}

export default SalesCard
