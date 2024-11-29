import flet as ft

def main(page: ft.Page):
    page.title = "Horários Agendados"
    page.bgcolor = '#FFDD78'
    page.padding = 0  
    page.scroll = ft.ScrollMode.ALWAYS
    page.horizontal_alignment = ft.CrossAxisAlignment.CENTER
    page.vertical_alignment = ft.MainAxisAlignment.CENTER
    page.window_width = 287.38
    page.window_height = 585

    # Header da Página
    header = ft.Container(
        content=ft.Row(
            [
                ft.Icon(ft.icons.ARROW_BACK, color="black", size=30),
                ft.Container(
                    content=ft.Text(
                        "Horários Agendados",
                        weight=ft.FontWeight.BOLD,
                        color='white',
                        text_align='center',
                        size=15,
                        bgcolor="#8C5120",
                    ),
                    padding=ft.padding.only(left=20, right=20, top=10, bottom=10), 
                    bgcolor="#8C5120",  # Fundo do texto
                    border_radius=50,
                ),
            ],
            alignment=ft.MainAxisAlignment.START,
            vertical_alignment=ft.CrossAxisAlignment.CENTER,
        ),
        padding=10,
        height=60,
        bgcolor="#FFDD78",
    )

    # Função para criar cada item de agendamento
    def create_schedule_item(name, date, time, image_url):
        return ft.Container(
            content=ft.Row(
                [
                    ft.Container(
                        width=50,
                        height=50,
                        content=ft.Image(
                            src=image_url,  # Caminho da imagem
                            fit=ft.ImageFit.COVER,
                        ),
                        border_radius=25, 
                        clip_behavior=ft.ClipBehavior.HARD_EDGE,
                    ),
                    ft.Column(
                        [
                            ft.Text(name, size=16, weight=ft.FontWeight.BOLD, color="black"),
                            # Exibir data e hora na mesma linha
                            ft.Row(
                                [
                                    ft.Text(date, size=14, color="#7D7D7D"),
                                    ft.Text(" • ", size=14, color="#7D7D7D"),  # Separador
                                    ft.Text(time, size=14, color="#6A6A6A"),
                                ],
                                alignment=ft.MainAxisAlignment.START,
                                spacing=5,
                            ),
                        ],
                        alignment=ft.MainAxisAlignment.START,
                        spacing=5,
                    ),
                ],
                alignment=ft.MainAxisAlignment.SPACE_BETWEEN,
                spacing=15,
            ),
            padding=10,
            bgcolor="#F4E3D7",
            border_radius=10,
            margin=ft.margin.symmetric(vertical=5, horizontal=10),
        )
    # Lista de agendamentos com fotos
    schedule_container = ft.Container(
    content=ft.Column(
        [ 
            create_schedule_item(
                "Mateus Emiliano", "10/11/2024", "09:30", "https://i.pinimg.com/736x/5a/be/3b/5abe3b7f37eee1519937b8923be6ecfc.jpg"
            ),
            create_schedule_item(
                "Marcos Ribeiro", "25/11/2024", "11:00", "https://i.pinimg.com/736x/32/a5/b8/32a5b84575fc64b48f10a0db8b1b47d4.jpg"
            ),
            create_schedule_item(
                "Julia Martins", "05/12/2024", "15:00", "https://i.pinimg.com/736x/f2/35/0d/f2350d28902a31c70b748f6c83c555f6.jpg"
            ),
            create_schedule_item(
                "Maria dos Santos", "17/12/2024", "18:30", "https://i.pinimg.com/736x/64/dd/e1/64dde1ba44c0b2488704222b14b60612.jpg"
            ),
        ],
        spacing=10,  # Maior espaçamento entre os itens
    ),
    bgcolor="#73513D",  # Fundo marrom atrás dos cards
    border_radius=20,
    padding=ft.Padding(top=10, bottom=50, left=10, right=10),
    margin=ft.margin.only(top=10, bottom=0, left=0, right=0), 
)

    # Footer com botões
    page.navigation_bar = ft.NavigationBar(
        destinations=[
            ft.NavigationBarDestination(icon=ft.icons.HOME_ROUNDED, label="Tela Inicial"),
            ft.NavigationBarDestination(icon=ft.icons.PERSON_ROUNDED, label="Perfil"),
        ],
        bgcolor="#BF5F0B",
        indicator_color="#DE8A18",
    )

    # Adicionando elementos à página
    page.add(header, schedule_container)
    page.update()

# Executar o app
ft.app(target=main)

