import flet as ft
from flet import *

BG_COLOR = "#FFDD78"
BG_WIDTH = 287
BG_HEIGHT = 585


def main(page: ft.Page):
    page.horizontal_alignment = ft.CrossAxisAlignment.CENTER
    page.vertical_alignment = ft.MainAxisAlignment.CENTER
    page.title = "MyLittlePet"
    page.bgcolor=BG_COLOR
    page.window_width = BG_WIDTH
    page.window_height = BG_HEIGHT
    page.padding = 0
    page.margin = 0

    def on_button_click(e):
        print(f"Botão clicado: {e.control.content.value}")

    def create_avatar():
        return ft.Container(
            width=61,
            height=61,
            bgcolor="#808080",
            border_radius=30.5,
        )

    def create_button(text):
        avatar = create_avatar()
        return ft.ElevatedButton(
            width=257,
            height=74,
            style=ft.ButtonStyle(
                shape=ft.RoundedRectangleBorder(radius=15),
                bgcolor="#779030",
                text_style=ft.TextStyle(
                    weight=ft.FontWeight.W_400,
                    size=20,
                    color="#FFFFFF"
                ),
            ),
            on_click=lambda e: print(f"Selecionado: {text}"),
            content=ft.Row(
                [
                    avatar,
                    ft.Text(
                        text,
                        size=15,
                        weight=ft.FontWeight.W_700,
                        color="#FFFFFF",
                        text_align=ft.TextAlign.START,
                        max_lines=1,
                        overflow=ft.TextOverflow.ELLIPSIS,
                    ),
                ],
                alignment=ft.MainAxisAlignment.START,
                spacing=10,
            ),
        )

    button1 = create_button("Lucas Silva da Costa")
    button2 = create_button("Ana Clara Macedo")
    button3 = create_button("Julia Soares Espinoza")
    button4 = create_button("Luiz Mariano Marcos")

    def route_change(page, route):
        page.views.clear()

        if route == "/":
            page.views.append(
                ft.View(
                    "/",
                    controls=[
                        ft.Stack(
                            controls=[
                                ft.Container(
                                    width=BG_WIDTH,
                                    height=BG_HEIGHT,
                                    bgcolor=BG_COLOR,
                                ),
                                ft.Column(
                                    controls=[
                                        ft.CircleAvatar(
                                            foreground_image_src="https://i.postimg.cc/pTCt4Mwv/Blue-Modern-Minimal-Pet-Clinic-Logo-3.png",
                                            width=156,
                                            height=151,
                                        ),
                                        ft.CupertinoButton(
                                            "Login",
                                            color="white",
                                            bgcolor=ft.colors.BROWN_500,
                                            width=200,
                                            border_radius=25,
                                            on_click=lambda _: page.go(
                                                "/login"),
                                        ),
                                        ft.CupertinoButton(
                                            "Cadastro",
                                            color="white",
                                            bgcolor=ft.colors.BROWN_500,
                                            width=200,
                                            border_radius=25,
                                            on_click=lambda _: page.go(
                                                "/cadastro"),
                                        ),
                                    ],
                                    alignment=ft.MainAxisAlignment.CENTER,
                                    horizontal_alignment=ft.CrossAxisAlignment.CENTER,
                                    spacing=20,
                                ),
                            ],
                            expand=True,
                            width=BG_WIDTH,
                            height=BG_HEIGHT,
                            alignment=ft.alignment.center,
                        ),
                    ],
                )
            )

        elif route == "/cadastro":
            width_inner = 240
            height_inner = 505
            button_width = 200
            button_height = 79
            spacing = (height_inner - (2 * button_height)) // 3
            side_margin = (width_inner - button_width) // 2

            page.views.append(
                ft.View(
                    "/cadastro",
                    controls=[
                        ft.Stack(
                            controls=[
                                ft.Container(
                                    width=BG_WIDTH,
                                    height=BG_HEIGHT,
                                    bgcolor=BG_COLOR,
                                ),
                                ft.Container(
                                    width=width_inner,
                                    height=height_inner,
                                    bgcolor="#C2690A",
                                    border_radius=12,
                                    alignment=ft.alignment.center,
                                ),
                                ft.Container(
                                    width=button_width,
                                    height=button_height,
                                    border_radius=25,
                                    bgcolor="#779030",
                                    top=spacing,
                                    left=side_margin,
                                    content=ft.Text(
                                        "Sou Pai/Mãe de Pet",
                                        size=24,
                                        weight=ft.FontWeight.W_400,
                                        color=ft.colors.WHITE,
                                        text_align=ft.TextAlign.CENTER,
                                    ),
                                    on_click=on_button_click,
                                ),
                                ft.Container(
                                    width=button_width,
                                    height=button_height,
                                    border_radius=25,
                                    bgcolor="#779030",
                                    top=spacing + button_height + spacing,
                                    left=side_margin,
                                    content=ft.Text(
                                        "Estou Aqui Para Pets",
                                        size=24,
                                        weight=ft.FontWeight.W_400,
                                        color=ft.colors.WHITE,
                                        text_align=ft.TextAlign.CENTER,
                                    ),
                                    on_click=on_button_click,
                                ),
                            ],
                            alignment=ft.alignment.center,
                            expand=True,
                        ),
                    ],
                )
            )

        elif route == "/login":
            page.views.append(
                ft.View(
                    "/login",
                    controls=[
                        ft.Stack(
                            expand=True,
                            controls=[
                                ft.Container(
                                    width=BG_WIDTH,
                                    height=BG_HEIGHT,
                                    bgcolor=BG_COLOR,
                                ),
                                ft.Container(
                                    width=245,
                                    height=505,
                                    bgcolor="#C2690A",
                                    border_radius=12,
                                    alignment=ft.alignment.center,
                                ),
                                ft.Container(
                                    top=20,
                                    left=50,
                                    content=ft.Column(
                                        controls=[
                                            ft.Container(
                                                width=157,
                                                height=46,
                                                border_radius=20,
                                                bgcolor="#779030",
                                                content=ft.Column(
                                                    controls=[
                                                        ft.Text("Login", color="white", size=24)],
                                                    alignment=ft.MainAxisAlignment.CENTER,
                                                    horizontal_alignment=ft.CrossAxisAlignment.CENTER,
                                                ),
                                            ),
                                        ],
                                        alignment=ft.MainAxisAlignment.START,
                                        spacing=10,
                                    ),
                                ),
                                ft.Container(
                                    top=80,
                                    left=20,
                                    content=ft.Column(
                                        controls=[
                                            ft.Text(
                                                "Email", color="white", size=20),
                                            ft.TextField(
                                                width=205.97,
                                                height=35,
                                                border_radius=5,
                                                bgcolor="white",
                                                color="black",
                                            ),
                                            ft.Text(
                                                "Senha", color="white", size=20),
                                            ft.TextField(
                                                width=205.97,
                                                height=35,
                                                border_radius=5,
                                                bgcolor="white",
                                                color="black",
                                            ),
                                        ],
                                        alignment=ft.MainAxisAlignment.START,
                                        spacing=10,
                                    ),
                                ),
                                ft.Container(
                                    top=230,
                                    left=10,
                                    content=ft.Column(
                                        controls=[
                                            ft.TextButton(
                                                "Esqueceu a sua senha?",
                                                style=ft.ButtonStyle(
                                                    color="#000000"),
                                            ),
                                            ft.Row(
                                                controls=[
                                                    ft.Text(
                                                        "Não tem uma conta ainda?", size=10, weight=ft.FontWeight.W_400, color="#000000"),
                                                    ft.TextButton(
                                                        "Registrar agora",
                                                        style=ft.ButtonStyle(
                                                            color=ft.colors.GREY,
                                                            bgcolor="#C2690A",
                                                            padding=ft.Padding(
                                                                top=0, right=0, bottom=0, left=1),
                                                        ),
                                                        on_click=lambda _: page.go(
                                                            "/cadastro"),
                                                    ),
                                                ],
                                                alignment=ft.MainAxisAlignment.START,
                                                spacing=10,
                                            ),
                                        ],
                                        alignment=ft.MainAxisAlignment.START,
                                        spacing=10,
                                    ),
                                ),
                                ft.Container(
                                    top=350,
                                    left=20,
                                    content=ft.ElevatedButton(
                                        content=ft.Text("Google"),
                                        on_click=lambda e: None,
                                        bgcolor=ft.colors.WHITE,
                                        color="red",
                                        width=207,
                                        height=40,
                                        style=ft.ButtonStyle(
                                            text_style=ft.TextStyle(
                                                size=15, weight=ft.FontWeight.W_700)
                                        ),
                                    ),
                                ),
                                ft.Container(
                                    top=400,
                                    left=20,
                                    content=ft.ElevatedButton(
                                        content=ft.Text("Facebook"),
                                        on_click=lambda e: None,
                                        bgcolor=ft.colors.WHITE,
                                        color="blue",
                                        width=207,
                                        height=40,
                                        style=ft.ButtonStyle(
                                            text_style=ft.TextStyle(
                                                size=15, weight=ft.FontWeight.W_700)
                                        ),
                                    ),
                                ),
                                ft.Container(
                                    top=450,
                                    left=50,
                                    content=ft.ElevatedButton(
                                        content=ft.Icon(ft.icons.PLAY_ARROW),
                                        on_click=lambda e: page.go(
                                            "/tela_inicial"),
                                        bgcolor="#779030",
                                        color="black",
                                        width=136,
                                        height=38,
                                    ),
                                ),
                            ],
                            alignment=ft.alignment.center,
                        ),
                    ],
                )
            )

        elif route == "/tela_inicial":
            page.views.append(
                ft.View(
                    "/tela_inicial",
                    controls=[
                        ft.Stack(
                            controls=[
                                ft.Container(
                                    width=BG_WIDTH,
                                    height=BG_HEIGHT,
                                    bgcolor="#FFDD78",
                                ),
                                ft.Container(
                                    bgcolor="#73513D",
                                    width=287.38,
                                    height=450,
                                    border_radius=20,
                                    alignment=ft.alignment.center,
                                    margin=ft.margin.only(top=70),
                                ),
                                ft.Container(
                                    top=20,
                                    left=65,
                                    right=65,
                                    alignment=ft.alignment.center,
                                    content=ft.Container(
                                        content=ft.Text(
                                            "Tela Inicial",
                                            weight=ft.FontWeight.BOLD,
                                            color="white",
                                            text_align="center",
                                            size=15,
                                        ),
                                        bgcolor="#8C5120",
                                        padding=ft.padding.symmetric(
                                            horizontal=20, vertical=10),
                                        border_radius=50,
                                    ),
                                ),
                                ft.Container(
                                    top=100,
                                    left=20,
                                    right=20,
                                    alignment=ft.alignment.center,
                                    content=ft.ElevatedButton(
                                        text="Ver Serviços Agendados",
                                        width=200,
                                        height=80,
                                        style=ft.ButtonStyle(
                                            shape=ft.RoundedRectangleBorder(
                                                radius=25),
                                            bgcolor="#779030",
                                            text_style=ft.TextStyle(
                                                weight=ft.FontWeight.W_400,
                                                size=24,
                                                color="#FFFFFF",
                                            ),
                                        ),
                                        on_click=lambda e: page.go(
                                            "/servicos_agendados"),
                                    ),
                                ),
                                ft.Container(
                                    top=200,
                                    left=20,
                                    right=20,
                                    alignment=ft.alignment.center,
                                    content=ft.ElevatedButton(
                                        text="Ver Horários Agendados",
                                        width=200,
                                        height=80,
                                        style=ft.ButtonStyle(
                                            shape=ft.RoundedRectangleBorder(
                                                radius=25),
                                            bgcolor="#779030",
                                            text_style=ft.TextStyle(
                                                weight=ft.FontWeight.W_400,
                                                size=24,
                                                color="#FFFFFF",
                                            ),
                                        ),
                                        on_click=None,
                                    ),
                                ),
                                ft.Container(
                                    top=300,
                                    left=20,
                                    right=20,
                                    alignment=ft.alignment.center,
                                    content=ft.ElevatedButton(
                                        text="Contrate Um Serviço",
                                        width=200,
                                        height=80,
                                        style=ft.ButtonStyle(
                                            shape=ft.RoundedRectangleBorder(
                                                radius=25),
                                            bgcolor="#779030",
                                            text_style=ft.TextStyle(
                                                weight=ft.FontWeight.W_400,
                                                size=24,
                                                color="#FFFFFF",
                                            ),
                                        ),
                                        on_click=None,
                                    ),
                                ),
                                ft.Container(
                                    bottom=0,
                                    content=ft.NavigationBar(
                                        destinations=[
                                            ft.NavigationBarDestination(
                                                icon=ft.icons.HOME_ROUNDED, label="Tela Inicial"
                                            ),
                                            ft.NavigationBarDestination(
                                                icon=ft.icons.PERSON_ROUNDED, label="Perfil"
                                            ),
                                        ],
                                        bgcolor="#BF5F0B",
                                        indicator_color="#DE8A18",
                                    ),
                                    width=BG_WIDTH,
                                    height=80,
                                    margin=ft.margin.only(bottom=0, top=0),
                                    bgcolor="#BF5F0B",
                                    alignment=ft.alignment.center,
                                ),
                            ],
                            width=BG_WIDTH,
                            height=BG_HEIGHT,
                            expand=True,
                        ),
                    ],
                )
            )

        elif route == "/servicos_agendados":
            page.views.append(
                ft.View(
                    "/servicos_agendados",
                    controls=[
                        ft.Stack(
                            controls=[
                                ft.Container(
                                    bgcolor="#73513D",
                                    width=BG_WIDTH,
                                    height=460,
                                    border_radius=20,
                                    margin=ft.margin.only(top=50)
                                ),
                                ft.Column(
                                    controls=[
                                        ft.Column(
                                            controls=[
                                                ft.Container(
                                                    content=button1,
                                                    padding=ft.padding.all(10)),
                                                ft.Container(
                                                    content=button2,
                                                    padding=ft.padding.all(10)),
                                                ft.Container(
                                                    content=button3,
                                                    padding=ft.padding.all(10)),
                                                ft.Container(
                                                    content=button4,
                                                    padding=ft.padding.all(10)),
                                            ],
                                            alignment=ft.MainAxisAlignment.CENTER,
                                            spacing=10,
                                            expand=True,
                                        ),
                                    ],
                                    alignment=ft.MainAxisAlignment.CENTER,
                                    expand=True,
                                    top=20,
                                    width=BG_WIDTH,
                                    height=460,
                                ),
                                ft.Container(
                                    bottom=0,
                                    content=ft.NavigationBar(
                                        destinations=[
                                            ft.NavigationBarDestination(
                                                icon=ft.icons.HOME_ROUNDED, label="Tela Inicial"
                                            ),
                                            ft.NavigationBarDestination(
                                                icon=ft.icons.PERSON_ROUNDED, label="Perfil"
                                            ),
                                        ],
                                        bgcolor="#BF5F0B",
                                        indicator_color="#DE8A18",
                                    ),
                                    width=BG_WIDTH,
                                    height=80,
                                    margin=ft.margin.only(bottom=0, top=0),
                                    bgcolor="#BF5F0B",
                                    alignment=ft.alignment.center,
                                ),
                                ft.Row(
                                    controls=[
                                        ft.IconButton(
                                            icon=ft.icons.ARROW_BACK,
                                            icon_size=30,
                                            on_click=lambda e: page.go(
                                                "/tela_inicial"),  # Voltar para tela inicial
                                            icon_color="black",
                                        ),
                                        ft.Container(
                                            content=ft.Text(
                                                "Serviços Agendados",
                                                weight=ft.FontWeight.BOLD,
                                                color="white",
                                                text_align="center",
                                                size=15,
                                            ),
                                            padding=ft.padding.only(
                                                left=20, right=20, top=10, bottom=10
                                            ),
                                            bgcolor="#8C5120",
                                            border_radius=50,
                                        ),
                                    ],
                                    alignment=ft.MainAxisAlignment.START,
                                    vertical_alignment=ft.CrossAxisAlignment.CENTER,
                                    bottom=480
                                ),
                            ],
                            width=BG_WIDTH,
                            height=BG_HEIGHT,
                            expand=True,
                            alignment=ft.alignment.center,
                        )
                    ]
                )
            )

        page.update()

    page.on_route_change = lambda e: route_change(page, page.route)
    page.go("/")


ft.app(target=main)
