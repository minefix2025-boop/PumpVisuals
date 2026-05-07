@Mod("pumpvisuals")
public class PumpVisuals {
    public PumpVisuals() {
        // Регистрация на шину событий
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Тут инициализация
    }
    
    // Пример: Отключение тумана (часть X-Ray функций)
    @SubscribeEvent
    public void onFogRender(EntityViewRenderEvent.FogColors event) {
        // Твоя логика изменения визуала здесь
    }
}
